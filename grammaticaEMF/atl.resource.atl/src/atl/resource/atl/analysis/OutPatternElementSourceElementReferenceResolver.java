/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.analysis;

public class OutPatternElementSourceElementReferenceResolver implements atl.resource.atl.IAtlReferenceResolver<atl.OutPatternElement, atl.InPatternElement> {
	
	private atl.resource.atl.analysis.AtlDefaultResolverDelegate<atl.OutPatternElement, atl.InPatternElement> delegate = new atl.resource.atl.analysis.AtlDefaultResolverDelegate<atl.OutPatternElement, atl.InPatternElement>();
	
	public void resolve(String identifier, atl.OutPatternElement container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final atl.resource.atl.IAtlReferenceResolveResult<atl.InPatternElement> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(atl.InPatternElement element, atl.OutPatternElement container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
