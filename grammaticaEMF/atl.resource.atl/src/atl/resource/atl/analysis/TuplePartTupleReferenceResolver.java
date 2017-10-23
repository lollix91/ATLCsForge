/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.analysis;

public class TuplePartTupleReferenceResolver implements atl.resource.atl.IAtlReferenceResolver<ocl.TuplePart, ocl.TupleExp> {
	
	private atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.TuplePart, ocl.TupleExp> delegate = new atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.TuplePart, ocl.TupleExp>();
	
	public void resolve(String identifier, ocl.TuplePart container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final atl.resource.atl.IAtlReferenceResolveResult<ocl.TupleExp> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(ocl.TupleExp element, ocl.TuplePart container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
