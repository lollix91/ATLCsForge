/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.analysis;

public class OclTypeOclExpressionReferenceResolver implements atl.resource.atl.IAtlReferenceResolver<ocl.OclType, ocl.OclExpression> {
	
	private atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.OclType, ocl.OclExpression> delegate = new atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.OclType, ocl.OclExpression>();
	
	public void resolve(String identifier, ocl.OclType container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final atl.resource.atl.IAtlReferenceResolveResult<ocl.OclExpression> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(ocl.OclExpression element, ocl.OclType container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
