/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.analysis;

public class IteratorLoopExprReferenceResolver implements atl.resource.atl.IAtlReferenceResolver<ocl.Iterator, ocl.LoopExp> {
	
	private atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.Iterator, ocl.LoopExp> delegate = new atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.Iterator, ocl.LoopExp>();
	
	public void resolve(String identifier, ocl.Iterator container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final atl.resource.atl.IAtlReferenceResolveResult<ocl.LoopExp> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(ocl.LoopExp element, ocl.Iterator container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
