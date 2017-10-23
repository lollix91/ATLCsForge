/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.debug;

/**
 * The DebugProxy allows to communicate between the interpreter, which runs in a
 * separate thread or process and the Eclipse Debug framework (i.e., the
 * DebugTarget class).
 */
public class AtlDebugProxy {
	
	public static final int STARTUP_DELAY = 1000;
	
	private java.io.PrintStream output;
	
	private java.io.BufferedReader reader;
	
	private atl.resource.atl.debug.AtlDebugTarget debugTarget;
	
	private atl.resource.atl.debug.AtlDebugCommunicationHelper communicationHelper = new atl.resource.atl.debug.AtlDebugCommunicationHelper();
	
	public AtlDebugProxy(atl.resource.atl.debug.AtlDebugTarget debugTarget, int requestPort) throws java.net.UnknownHostException, java.io.IOException {
		this.debugTarget = debugTarget;
		// give interpreter a chance to start
		try {
			Thread.sleep(STARTUP_DELAY);
		} catch (InterruptedException e) {
		}
		startSocket(requestPort);
	}
	
	private void startSocket(int requestPort) throws java.net.UnknownHostException, java.io.IOException {
		// creating client proxy socket (trying to connect)...
		java.net.Socket client = new java.net.Socket("localhost", requestPort);
		// creating client proxy socket - done. (connected)
		try {
			java.io.BufferedInputStream input = new java.io.BufferedInputStream(client.getInputStream());
			reader = new java.io.BufferedReader(new java.io.InputStreamReader(input));
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
		try {
			output = new java.io.PrintStream(client.getOutputStream());
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
	}
	
	public void resume() {
		sendCommand(atl.resource.atl.debug.EAtlDebugMessageTypes.RESUME);
	}
	
	public void stepOver() {
		sendCommand(atl.resource.atl.debug.EAtlDebugMessageTypes.STEP_OVER);
	}
	
	public void stepInto() {
		sendCommand(atl.resource.atl.debug.EAtlDebugMessageTypes.STEP_INTO);
	}
	
	public void stepReturn() {
		sendCommand(atl.resource.atl.debug.EAtlDebugMessageTypes.STEP_RETURN);
	}
	
	public void terminate() {
		sendCommand(atl.resource.atl.debug.EAtlDebugMessageTypes.EXIT);
	}
	
	public atl.resource.atl.debug.AtlDebugMessage getStack() {
		return sendCommandAndRead(atl.resource.atl.debug.EAtlDebugMessageTypes.GET_STACK);
	}
	
	public void addLineBreakpoint(String location, int line) {
		atl.resource.atl.debug.AtlDebugMessage message = new atl.resource.atl.debug.AtlDebugMessage(atl.resource.atl.debug.EAtlDebugMessageTypes.ADD_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public void removeLineBreakpoint(String location, int line) {
		atl.resource.atl.debug.AtlDebugMessage message = new atl.resource.atl.debug.AtlDebugMessage(atl.resource.atl.debug.EAtlDebugMessageTypes.REMOVE_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public org.eclipse.debug.core.model.IVariable[] getStackVariables(String stackFrame) {
		atl.resource.atl.debug.AtlDebugMessage response = sendCommandAndRead(atl.resource.atl.debug.EAtlDebugMessageTypes.GET_FRAME_VARIABLES, new String[] {stackFrame});
		String[] ids = response.getArguments();
		// fetch all variables
		org.eclipse.debug.core.model.IVariable[] variables = getVariables(ids);
		return variables;
	}
	
	public org.eclipse.debug.core.model.IVariable[] getVariables(String... requestedIDs) {
		atl.resource.atl.debug.AtlDebugMessage response = sendCommandAndRead(atl.resource.atl.debug.EAtlDebugMessageTypes.GET_VARIABLES, requestedIDs);
		String[] varStrings = response.getArguments();
		atl.resource.atl.debug.AtlDebugVariable[] variables  = new atl.resource.atl.debug.AtlDebugVariable[varStrings.length];
		int i = 0;
		for (String varString : varStrings) {
			java.util.Map<String, String> properties = atl.resource.atl.util.AtlStringUtil.convertFromString(varString);
			
			// convert varString to variables and values
			String valueString = properties.get("!valueString");
			String valueRefType = "valueRefType";
			java.util.Map<String, Long> childVariables = new java.util.TreeMap<String, Long>(new java.util.Comparator<String>() {
				public int compare(String s1, String s2) {
					return s1.compareToIgnoreCase(s2);
				}
			});
			for (String property : properties.keySet()) {
				// ignore special properties - they are not children
				if (property.startsWith("!")) {
					continue;
				}
				childVariables.put(property, Long.parseLong(properties.get(property)));
			}
			String id = properties.get("!id");
			org.eclipse.debug.core.model.IValue value = new atl.resource.atl.debug.AtlDebugValue(debugTarget, id, valueString, valueRefType, childVariables);
			
			String variableName = properties.get("!name");
			String variableRefType = properties.get("!type");
			
			atl.resource.atl.debug.AtlDebugVariable variable = new atl.resource.atl.debug.AtlDebugVariable(debugTarget, variableName, value, variableRefType);
			variables[i++] = variable;
		}
		return variables;
	}
	
	private void sendCommand(atl.resource.atl.debug.EAtlDebugMessageTypes command, String... parameters) {
		atl.resource.atl.debug.AtlDebugMessage message = new atl.resource.atl.debug.AtlDebugMessage(command, parameters);
		communicationHelper.sendEvent(message, output);
	}
	
	private atl.resource.atl.debug.AtlDebugMessage sendCommandAndRead(atl.resource.atl.debug.EAtlDebugMessageTypes command, String... parameters) {
		atl.resource.atl.debug.AtlDebugMessage message = new atl.resource.atl.debug.AtlDebugMessage(command, parameters);
		return communicationHelper.sendAndReceive(message, output, reader);
	}
	
}
