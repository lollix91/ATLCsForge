/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.mopp;

/**
 * A basic implementation of the atl.resource.atl.IAtlURIMapping interface that
 * can map identifiers to URIs.
 * 
 * @param <ReferenceType> unused type parameter which is needed to implement
 * atl.resource.atl.IAtlURIMapping.
 */
public class AtlURIMapping<ReferenceType> implements atl.resource.atl.IAtlURIMapping<ReferenceType> {
	
	private org.eclipse.emf.common.util.URI uri;
	private String identifier;
	private String warning;
	
	public AtlURIMapping(String identifier, org.eclipse.emf.common.util.URI newIdentifier, String warning) {
		super();
		this.uri = newIdentifier;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public org.eclipse.emf.common.util.URI getTargetIdentifier() {
		return uri;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}
