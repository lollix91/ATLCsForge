/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class AtlKeyword extends atl.resource.atl.grammar.AtlSyntaxElement {
	
	private final String value;
	
	public AtlKeyword(String value, atl.resource.atl.grammar.AtlCardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
