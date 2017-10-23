/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface IAtlExpectedElement {
	
	/**
	 * Returns the names of all tokens that are expected at the given position.
	 */
	public java.util.Set<String> getTokenNames();
	
	/**
	 * Returns the metaclass of the rule that contains the expected element.
	 */
	public org.eclipse.emf.ecore.EClass getRuleMetaclass();
	
	/**
	 * Returns the syntax element that is expected.
	 */
	public atl.resource.atl.grammar.AtlSyntaxElement getSymtaxElement();
	
	/**
	 * Adds an element that is a valid follower for this element.
	 */
	public void addFollower(atl.resource.atl.IAtlExpectedElement follower, atl.resource.atl.mopp.AtlContainedFeature[] path);
	
	/**
	 * Returns all valid followers for this element. Each follower is represented by a
	 * pair of an expected elements and the containment trace that leads from the
	 * current element to the follower.
	 */
	public java.util.Collection<atl.resource.atl.util.AtlPair<atl.resource.atl.IAtlExpectedElement, atl.resource.atl.mopp.AtlContainedFeature[]>> getFollowers();
	
}
