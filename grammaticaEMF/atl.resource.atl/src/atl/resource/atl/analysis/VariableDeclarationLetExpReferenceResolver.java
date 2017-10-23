/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.analysis;

public class VariableDeclarationLetExpReferenceResolver implements atl.resource.atl.IAtlReferenceResolver<ocl.VariableDeclaration, ocl.LetExp> {
	
	private atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.VariableDeclaration, ocl.LetExp> delegate = new atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.VariableDeclaration, ocl.LetExp>();
	
	public void resolve(String identifier, ocl.VariableDeclaration container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final atl.resource.atl.IAtlReferenceResolveResult<ocl.LetExp> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(ocl.LetExp element, ocl.VariableDeclaration container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
