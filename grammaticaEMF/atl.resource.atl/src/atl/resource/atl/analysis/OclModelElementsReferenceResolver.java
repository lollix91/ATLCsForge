/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.analysis;

public class OclModelElementsReferenceResolver implements atl.resource.atl.IAtlReferenceResolver<ocl.OclModel, ocl.OclModelElement> {
	
	private atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.OclModel, ocl.OclModelElement> delegate = new atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.OclModel, ocl.OclModelElement>();
	
	public void resolve(String identifier, ocl.OclModel container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final atl.resource.atl.IAtlReferenceResolveResult<ocl.OclModelElement> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(ocl.OclModelElement element, ocl.OclModel container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
