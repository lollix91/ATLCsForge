/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.debug;

public class AtlSourceLookupParticipant extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws org.eclipse.core.runtime.CoreException {
		if (object instanceof atl.resource.atl.debug.AtlStackFrame) {
			atl.resource.atl.debug.AtlStackFrame frame = (atl.resource.atl.debug.AtlStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}
