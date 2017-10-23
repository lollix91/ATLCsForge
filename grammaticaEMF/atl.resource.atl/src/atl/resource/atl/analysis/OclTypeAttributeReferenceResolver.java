/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.analysis;

public class OclTypeAttributeReferenceResolver implements atl.resource.atl.IAtlReferenceResolver<ocl.OclType, ocl.Attribute> {
	
	private atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.OclType, ocl.Attribute> delegate = new atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.OclType, ocl.Attribute>();
	
	public void resolve(String identifier, ocl.OclType container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final atl.resource.atl.IAtlReferenceResolveResult<ocl.Attribute> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(ocl.Attribute element, ocl.OclType container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
