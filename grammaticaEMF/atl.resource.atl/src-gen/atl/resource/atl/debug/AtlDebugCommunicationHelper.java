/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.debug;

public class AtlDebugCommunicationHelper {
	
	public void sendEvent(atl.resource.atl.debug.AtlDebugMessage message, java.io.PrintStream stream) {
		synchronized (stream) {
			stream.println(message.serialize());
		}
	}
	
	/**
	 * Sends a message using the given stream and waits for an answer.
	 * 
	 * @param messageType the type of message to send
	 * @param stream the stream to send the message to
	 * @param reader the reader to obtain the answer from
	 * @param parameters additional parameter to send
	 * 
	 * @return the answer that is received
	 */
	public atl.resource.atl.debug.AtlDebugMessage sendAndReceive(atl.resource.atl.debug.AtlDebugMessage message, java.io.PrintStream stream, java.io.BufferedReader reader) {
		synchronized (stream) {
			sendEvent(message, stream);
			atl.resource.atl.debug.AtlDebugMessage response = receive(reader);
			return response;
		}
	}
	
	/**
	 * Receives a message from the given reader. This method block until a message has
	 * arrived.
	 * 
	 * @param reader the read to obtain the message from
	 * 
	 * @return the received message
	 */
	public atl.resource.atl.debug.AtlDebugMessage receive(java.io.BufferedReader reader) {
		try {
			String response = reader.readLine();
			if (response == null) {
				return null;
			}
			atl.resource.atl.debug.AtlDebugMessage receivedMessage = atl.resource.atl.debug.AtlDebugMessage.deserialize(response);
			return receivedMessage;
		} catch (java.io.IOException e) {
			return null;
		}
	}
	
}
