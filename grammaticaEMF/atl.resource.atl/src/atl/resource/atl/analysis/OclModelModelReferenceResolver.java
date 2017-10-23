/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.analysis;

public class OclModelModelReferenceResolver implements atl.resource.atl.IAtlReferenceResolver<ocl.OclModel, ocl.OclModel> {
	
	private atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.OclModel, ocl.OclModel> delegate = new atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.OclModel, ocl.OclModel>();
	
	public void resolve(String identifier, ocl.OclModel container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final atl.resource.atl.IAtlReferenceResolveResult<ocl.OclModel> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(ocl.OclModel element, ocl.OclModel container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
