/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.analysis;

public class HelperQueryReferenceResolver implements atl.resource.atl.IAtlReferenceResolver<atl.Helper, atl.Query> {
	
	private atl.resource.atl.analysis.AtlDefaultResolverDelegate<atl.Helper, atl.Query> delegate = new atl.resource.atl.analysis.AtlDefaultResolverDelegate<atl.Helper, atl.Query>();
	
	public void resolve(String identifier, atl.Helper container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final atl.resource.atl.IAtlReferenceResolveResult<atl.Query> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(atl.Query element, atl.Helper container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
