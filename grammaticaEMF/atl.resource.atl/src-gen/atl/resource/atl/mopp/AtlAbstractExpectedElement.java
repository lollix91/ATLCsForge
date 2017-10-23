/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class AtlAbstractExpectedElement implements atl.resource.atl.IAtlExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	
	private java.util.Set<atl.resource.atl.util.AtlPair<atl.resource.atl.IAtlExpectedElement, atl.resource.atl.mopp.AtlContainedFeature[]>> followers = new java.util.LinkedHashSet<atl.resource.atl.util.AtlPair<atl.resource.atl.IAtlExpectedElement, atl.resource.atl.mopp.AtlContainedFeature[]>>();
	
	public AtlAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(atl.resource.atl.IAtlExpectedElement follower, atl.resource.atl.mopp.AtlContainedFeature[] path) {
		followers.add(new atl.resource.atl.util.AtlPair<atl.resource.atl.IAtlExpectedElement, atl.resource.atl.mopp.AtlContainedFeature[]>(follower, path));
	}
	
	public java.util.Collection<atl.resource.atl.util.AtlPair<atl.resource.atl.IAtlExpectedElement, atl.resource.atl.mopp.AtlContainedFeature[]>> getFollowers() {
		return followers;
	}
	
}
