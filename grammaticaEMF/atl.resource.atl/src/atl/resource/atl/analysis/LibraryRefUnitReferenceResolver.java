/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.analysis;

public class LibraryRefUnitReferenceResolver implements atl.resource.atl.IAtlReferenceResolver<atl.LibraryRef, atl.Unit> {
	
	private atl.resource.atl.analysis.AtlDefaultResolverDelegate<atl.LibraryRef, atl.Unit> delegate = new atl.resource.atl.analysis.AtlDefaultResolverDelegate<atl.LibraryRef, atl.Unit>();
	
	public void resolve(String identifier, atl.LibraryRef container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final atl.resource.atl.IAtlReferenceResolveResult<atl.Unit> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(atl.Unit element, atl.LibraryRef container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
