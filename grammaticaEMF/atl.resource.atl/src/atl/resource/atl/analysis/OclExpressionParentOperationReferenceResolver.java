/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.analysis;

public class OclExpressionParentOperationReferenceResolver implements atl.resource.atl.IAtlReferenceResolver<ocl.OclExpression, ocl.OperationCallExp> {
	
	private atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.OclExpression, ocl.OperationCallExp> delegate = new atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.OclExpression, ocl.OperationCallExp>();
	
	public void resolve(String identifier, ocl.OclExpression container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final atl.resource.atl.IAtlReferenceResolveResult<ocl.OperationCallExp> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(ocl.OperationCallExp element, ocl.OclExpression container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
