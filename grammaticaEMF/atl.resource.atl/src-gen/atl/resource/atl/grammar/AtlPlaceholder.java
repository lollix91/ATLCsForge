/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class AtlPlaceholder extends atl.resource.atl.grammar.AtlTerminal {
	
	private final String tokenName;
	
	public AtlPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, atl.resource.atl.grammar.AtlCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
