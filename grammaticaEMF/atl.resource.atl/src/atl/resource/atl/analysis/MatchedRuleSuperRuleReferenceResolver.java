/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.analysis;

public class MatchedRuleSuperRuleReferenceResolver implements atl.resource.atl.IAtlReferenceResolver<atl.MatchedRule, atl.MatchedRule> {
	
	private atl.resource.atl.analysis.AtlDefaultResolverDelegate<atl.MatchedRule, atl.MatchedRule> delegate = new atl.resource.atl.analysis.AtlDefaultResolverDelegate<atl.MatchedRule, atl.MatchedRule>();
	
	public void resolve(String identifier, atl.MatchedRule container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final atl.resource.atl.IAtlReferenceResolveResult<atl.MatchedRule> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(atl.MatchedRule element, atl.MatchedRule container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
