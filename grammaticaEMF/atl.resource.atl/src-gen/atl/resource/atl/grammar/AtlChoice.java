/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.grammar;

public class AtlChoice extends atl.resource.atl.grammar.AtlSyntaxElement {
	
	public AtlChoice(atl.resource.atl.grammar.AtlCardinality cardinality, atl.resource.atl.grammar.AtlSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return atl.resource.atl.util.AtlStringUtil.explode(getChildren(), "|");
	}
	
}
