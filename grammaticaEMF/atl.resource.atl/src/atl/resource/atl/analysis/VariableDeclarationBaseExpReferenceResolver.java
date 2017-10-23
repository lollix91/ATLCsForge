/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.analysis;

public class VariableDeclarationBaseExpReferenceResolver implements atl.resource.atl.IAtlReferenceResolver<ocl.VariableDeclaration, ocl.IterateExp> {
	
	private atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.VariableDeclaration, ocl.IterateExp> delegate = new atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.VariableDeclaration, ocl.IterateExp>();
	
	public void resolve(String identifier, ocl.VariableDeclaration container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final atl.resource.atl.IAtlReferenceResolveResult<ocl.IterateExp> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(ocl.IterateExp element, ocl.VariableDeclaration container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
