/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.analysis;

public class MapElementMapReferenceResolver implements atl.resource.atl.IAtlReferenceResolver<ocl.MapElement, ocl.MapExp> {
	
	private atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.MapElement, ocl.MapExp> delegate = new atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.MapElement, ocl.MapExp>();
	
	public void resolve(String identifier, ocl.MapElement container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final atl.resource.atl.IAtlReferenceResolveResult<ocl.MapExp> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(ocl.MapExp element, ocl.MapElement container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
