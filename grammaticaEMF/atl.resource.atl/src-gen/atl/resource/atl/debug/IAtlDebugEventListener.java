/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.debug;

public interface IAtlDebugEventListener {
	
	/**
	 * Notification that the given event occurred in the while debugging.
	 */
	public void handleMessage(atl.resource.atl.debug.AtlDebugMessage message);
}
