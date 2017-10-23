/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.grammar;

public class AtlCompound extends atl.resource.atl.grammar.AtlSyntaxElement {
	
	public AtlCompound(atl.resource.atl.grammar.AtlChoice choice, atl.resource.atl.grammar.AtlCardinality cardinality) {
		super(cardinality, new atl.resource.atl.grammar.AtlSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
