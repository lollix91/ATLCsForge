/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.analysis;

public class TupleTypeAttributeTupleTypeReferenceResolver implements atl.resource.atl.IAtlReferenceResolver<ocl.TupleTypeAttribute, ocl.TupleType> {
	
	private atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.TupleTypeAttribute, ocl.TupleType> delegate = new atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.TupleTypeAttribute, ocl.TupleType>();
	
	public void resolve(String identifier, ocl.TupleTypeAttribute container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final atl.resource.atl.IAtlReferenceResolveResult<ocl.TupleType> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(ocl.TupleType element, ocl.TupleTypeAttribute container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
