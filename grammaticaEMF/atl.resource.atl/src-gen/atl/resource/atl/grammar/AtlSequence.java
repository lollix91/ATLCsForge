/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.grammar;

public class AtlSequence extends atl.resource.atl.grammar.AtlSyntaxElement {
	
	public AtlSequence(atl.resource.atl.grammar.AtlCardinality cardinality, atl.resource.atl.grammar.AtlSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return atl.resource.atl.util.AtlStringUtil.explode(getChildren(), " ");
	}
	
}
