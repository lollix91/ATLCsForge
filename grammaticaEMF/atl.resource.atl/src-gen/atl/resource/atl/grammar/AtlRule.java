/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class AtlRule extends atl.resource.atl.grammar.AtlSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public AtlRule(org.eclipse.emf.ecore.EClass metaclass, atl.resource.atl.grammar.AtlChoice choice, atl.resource.atl.grammar.AtlCardinality cardinality) {
		super(cardinality, new atl.resource.atl.grammar.AtlSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public atl.resource.atl.grammar.AtlChoice getDefinition() {
		return (atl.resource.atl.grammar.AtlChoice) getChildren()[0];
	}
	
}

