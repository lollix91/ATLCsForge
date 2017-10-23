/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.analysis;

public class VariableDeclarationVariableExpReferenceResolver implements atl.resource.atl.IAtlReferenceResolver<ocl.VariableDeclaration, ocl.VariableExp> {
	
	private atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.VariableDeclaration, ocl.VariableExp> delegate = new atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.VariableDeclaration, ocl.VariableExp>();
	
	public void resolve(String identifier, ocl.VariableDeclaration container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final atl.resource.atl.IAtlReferenceResolveResult<ocl.VariableExp> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(ocl.VariableExp element, ocl.VariableDeclaration container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
