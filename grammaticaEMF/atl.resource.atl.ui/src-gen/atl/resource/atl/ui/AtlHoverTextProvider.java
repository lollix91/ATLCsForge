/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.ui;

public class AtlHoverTextProvider implements atl.resource.atl.IAtlHoverTextProvider {
	
	private atl.resource.atl.ui.AtlDefaultHoverTextProvider defaultProvider = new atl.resource.atl.ui.AtlDefaultHoverTextProvider();
	
	public String getHoverText(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EObject referencedObject) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(referencedObject);
	}
	
	public String getHoverText(org.eclipse.emf.ecore.EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
