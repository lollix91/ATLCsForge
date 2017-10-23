/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.analysis;

public class InPatternRuleReferenceResolver implements atl.resource.atl.IAtlReferenceResolver<atl.InPattern, atl.MatchedRule> {
	
	private atl.resource.atl.analysis.AtlDefaultResolverDelegate<atl.InPattern, atl.MatchedRule> delegate = new atl.resource.atl.analysis.AtlDefaultResolverDelegate<atl.InPattern, atl.MatchedRule>();
	
	public void resolve(String identifier, atl.InPattern container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final atl.resource.atl.IAtlReferenceResolveResult<atl.MatchedRule> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(atl.MatchedRule element, atl.InPattern container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
