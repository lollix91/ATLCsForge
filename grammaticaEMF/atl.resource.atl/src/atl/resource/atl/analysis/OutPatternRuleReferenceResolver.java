/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.analysis;

public class OutPatternRuleReferenceResolver implements atl.resource.atl.IAtlReferenceResolver<atl.OutPattern, atl.Rule> {
	
	private atl.resource.atl.analysis.AtlDefaultResolverDelegate<atl.OutPattern, atl.Rule> delegate = new atl.resource.atl.analysis.AtlDefaultResolverDelegate<atl.OutPattern, atl.Rule>();
	
	public void resolve(String identifier, atl.OutPattern container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final atl.resource.atl.IAtlReferenceResolveResult<atl.Rule> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(atl.Rule element, atl.OutPattern container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
