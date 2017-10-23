/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.debug;

public class AtlSourceLocator extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupDirector {
	
	public void initializeParticipants() {
		addParticipants(new org.eclipse.debug.core.sourcelookup.ISourceLookupParticipant[]{new atl.resource.atl.debug.AtlSourceLookupParticipant()});
	}
	
}
