/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.ui;

/**
 * A class used to initialize default preference values.
 */
public class AtlPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = atl.resource.atl.ui.AtlUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(atl.resource.atl.ui.AtlPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(atl.resource.atl.ui.AtlPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = atl.resource.atl.ui.AtlUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new atl.resource.atl.mopp.AtlMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = atl.resource.atl.ui.AtlUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new atl.resource.atl.mopp.AtlMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, atl.resource.atl.IAtlMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		atl.resource.atl.ui.AtlBracketSet bracketSet = new atl.resource.atl.ui.AtlBracketSet(null, null);
		final java.util.Collection<atl.resource.atl.IAtlBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (atl.resource.atl.IAtlBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + atl.resource.atl.ui.AtlPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, atl.resource.atl.mopp.AtlMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		String[] tokenNames = metaInformation.getSyntaxHighlightableTokenNames();
		if (tokenNames == null) {
			return;
		}
		for (int i = 0; i < tokenNames.length; i++) {
			String tokenName = tokenNames[i];
			atl.resource.atl.IAtlTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(atl.resource.atl.ui.AtlSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, atl.resource.atl.ui.AtlSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(atl.resource.atl.ui.AtlSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, atl.resource.atl.ui.AtlSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(atl.resource.atl.ui.AtlSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, atl.resource.atl.ui.AtlSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(atl.resource.atl.ui.AtlSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, atl.resource.atl.ui.AtlSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(atl.resource.atl.ui.AtlSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, atl.resource.atl.ui.AtlSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(atl.resource.atl.ui.AtlSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, atl.resource.atl.ui.AtlSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
	}
	
	private String getColorString(int[] colorAsRGB) {
		if (colorAsRGB == null) {
			return "0,0,0";
		}
		if (colorAsRGB.length != 3) {
			return "0,0,0";
		}
		return colorAsRGB[0] + "," +colorAsRGB[1] + ","+ colorAsRGB[2];
	}
}
