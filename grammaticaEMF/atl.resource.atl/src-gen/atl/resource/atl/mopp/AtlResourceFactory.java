/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.mopp;

public class AtlResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public AtlResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new atl.resource.atl.mopp.AtlResource(uri);
	}
	
}
