/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.debug;

/**
 * DebugMessages are exchanged between the debug server (the Eclipse debug
 * framework) and the debug client (a running process or interpreter). To exchange
 * messages they are serialized and sent over sockets.
 */
public class AtlDebugMessage {
	
	private static final char DELIMITER = ':';
	private atl.resource.atl.debug.EAtlDebugMessageTypes messageType;
	private String[] arguments;
	
	public AtlDebugMessage(atl.resource.atl.debug.EAtlDebugMessageTypes messageType, String[] arguments) {
		super();
		this.messageType = messageType;
		this.arguments = arguments;
	}
	
	public AtlDebugMessage(atl.resource.atl.debug.EAtlDebugMessageTypes messageType, java.util.List<String> arguments) {
		super();
		this.messageType = messageType;
		this.arguments = new String[arguments.size()];
		for (int i = 0; i < arguments.size(); i++) {
			this.arguments[i] = arguments.get(i);
		}
	}
	
	public atl.resource.atl.debug.EAtlDebugMessageTypes getMessageType() {
		return messageType;
	}
	
	public String[] getArguments() {
		return arguments;
	}
	
	public String serialize() {
		java.util.List<String> parts = new java.util.ArrayList<String>();
		parts.add(messageType.name());
		for (String argument : arguments) {
			parts.add(argument);
		}
		return atl.resource.atl.util.AtlStringUtil.encode(DELIMITER, parts);
	}
	
	public static AtlDebugMessage deserialize(String response) {
		java.util.List<String> parts = atl.resource.atl.util.AtlStringUtil.decode(response, DELIMITER);
		String messageType = parts.get(0);
		String[] arguments = new String[parts.size() - 1];
		for (int i = 1; i < parts.size(); i++) {
			arguments[i - 1] = parts.get(i);
		}
		atl.resource.atl.debug.EAtlDebugMessageTypes type = atl.resource.atl.debug.EAtlDebugMessageTypes.valueOf(messageType);
		AtlDebugMessage message = new AtlDebugMessage(type, arguments);
		return message;
	}
	
	public boolean hasType(atl.resource.atl.debug.EAtlDebugMessageTypes type) {
		return this.messageType == type;
	}
	
	public String getArgument(int index) {
		return getArguments()[index];
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + "[" + messageType.name() + ": " + atl.resource.atl.util.AtlStringUtil.explode(arguments, ", ") + "]";
	}
	
}
