/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.ui;

public class AtlUIMetaInformation extends atl.resource.atl.mopp.AtlMetaInformation {
	
	public atl.resource.atl.IAtlHoverTextProvider getHoverTextProvider() {
		return new atl.resource.atl.ui.AtlHoverTextProvider();
	}
	
	public atl.resource.atl.ui.AtlImageProvider getImageProvider() {
		return atl.resource.atl.ui.AtlImageProvider.INSTANCE;
	}
	
	public atl.resource.atl.ui.AtlColorManager createColorManager() {
		return new atl.resource.atl.ui.AtlColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(atl.resource.atl.IAtlTextResource,
	 * atl.resource.atl.ui.AtlColorManager) instead.
	 */
	public atl.resource.atl.ui.AtlTokenScanner createTokenScanner(atl.resource.atl.ui.AtlColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public atl.resource.atl.ui.AtlTokenScanner createTokenScanner(atl.resource.atl.IAtlTextResource resource, atl.resource.atl.ui.AtlColorManager colorManager) {
		return new atl.resource.atl.ui.AtlTokenScanner(resource, colorManager);
	}
	
	public atl.resource.atl.ui.AtlCodeCompletionHelper createCodeCompletionHelper() {
		return new atl.resource.atl.ui.AtlCodeCompletionHelper();
	}
	
}
