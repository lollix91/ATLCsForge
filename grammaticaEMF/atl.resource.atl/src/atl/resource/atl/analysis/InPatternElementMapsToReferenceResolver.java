/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.analysis;

public class InPatternElementMapsToReferenceResolver implements atl.resource.atl.IAtlReferenceResolver<atl.InPatternElement, atl.OutPatternElement> {
	
	private atl.resource.atl.analysis.AtlDefaultResolverDelegate<atl.InPatternElement, atl.OutPatternElement> delegate = new atl.resource.atl.analysis.AtlDefaultResolverDelegate<atl.InPatternElement, atl.OutPatternElement>();
	
	public void resolve(String identifier, atl.InPatternElement container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final atl.resource.atl.IAtlReferenceResolveResult<atl.OutPatternElement> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(atl.OutPatternElement element, atl.InPatternElement container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
