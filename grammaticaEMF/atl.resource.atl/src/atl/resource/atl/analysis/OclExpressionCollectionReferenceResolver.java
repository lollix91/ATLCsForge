/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.analysis;

public class OclExpressionCollectionReferenceResolver implements atl.resource.atl.IAtlReferenceResolver<ocl.OclExpression, ocl.CollectionExp> {
	
	private atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.OclExpression, ocl.CollectionExp> delegate = new atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.OclExpression, ocl.CollectionExp>();
	
	public void resolve(String identifier, ocl.OclExpression container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final atl.resource.atl.IAtlReferenceResolveResult<ocl.CollectionExp> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(ocl.CollectionExp element, ocl.OclExpression container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
