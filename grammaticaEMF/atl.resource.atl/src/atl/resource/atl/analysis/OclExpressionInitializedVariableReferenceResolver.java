/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.analysis;

public class OclExpressionInitializedVariableReferenceResolver implements atl.resource.atl.IAtlReferenceResolver<ocl.OclExpression, ocl.VariableDeclaration> {
	
	private atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.OclExpression, ocl.VariableDeclaration> delegate = new atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.OclExpression, ocl.VariableDeclaration>();
	
	public void resolve(String identifier, ocl.OclExpression container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final atl.resource.atl.IAtlReferenceResolveResult<ocl.VariableDeclaration> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(ocl.VariableDeclaration element, ocl.OclExpression container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
