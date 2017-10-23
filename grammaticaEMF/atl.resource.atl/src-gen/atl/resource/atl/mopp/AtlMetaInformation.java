/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.mopp;

public class AtlMetaInformation implements atl.resource.atl.IAtlMetaInformation {
	
	public String getSyntaxName() {
		return "atl";
	}
	
	public String getURI() {
		return "http://www.eclipse.org/gmt/2005/ATL";
	}
	
	public atl.resource.atl.IAtlTextScanner createLexer() {
		return new atl.resource.atl.mopp.AtlAntlrScanner(new atl.resource.atl.mopp.AtlLexer());
	}
	
	public atl.resource.atl.IAtlTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new atl.resource.atl.mopp.AtlParser().createInstance(inputStream, encoding);
	}
	
	public atl.resource.atl.IAtlTextPrinter createPrinter(java.io.OutputStream outputStream, atl.resource.atl.IAtlTextResource resource) {
		return new atl.resource.atl.mopp.AtlPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new atl.resource.atl.mopp.AtlSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new atl.resource.atl.mopp.AtlSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public atl.resource.atl.IAtlReferenceResolverSwitch getReferenceResolverSwitch() {
		return new atl.resource.atl.mopp.AtlReferenceResolverSwitch();
	}
	
	public atl.resource.atl.IAtlTokenResolverFactory getTokenResolverFactory() {
		return new atl.resource.atl.mopp.AtlTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "csemf/ATL.cs";
	}
	
	public String[] getTokenNames() {
		return atl.resource.atl.mopp.AtlParser.tokenNames;
	}
	
	public atl.resource.atl.IAtlTokenStyle getDefaultTokenStyle(String tokenName) {
		return new atl.resource.atl.mopp.AtlTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<atl.resource.atl.IAtlBracketPair> getBracketPairs() {
		return new atl.resource.atl.mopp.AtlBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new atl.resource.atl.mopp.AtlFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new atl.resource.atl.mopp.AtlResourceFactory();
	}
	
	public atl.resource.atl.mopp.AtlNewFileContentProvider getNewFileContentProvider() {
		return new atl.resource.atl.mopp.AtlNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new atl.resource.atl.mopp.AtlResourceFactory());
	}
	
	/**
	 * Returns the key of the option that can be used to register a preprocessor that
	 * is used as a pipe when loading resources. This key is language-specific. To
	 * register one preprocessor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getInputStreamPreprocessorProviderOptionKey() {
		return getSyntaxName() + "_" + "INPUT_STREAM_PREPROCESSOR_PROVIDER";
	}
	
	/**
	 * Returns the key of the option that can be used to register a post-processors
	 * that are invoked after loading resources. This key is language-specific. To
	 * register one post-processor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getResourcePostProcessorProviderOptionKey() {
		return getSyntaxName() + "_" + "RESOURCE_POSTPROCESSOR_PROVIDER";
	}
	
	public String getLaunchConfigurationType() {
		return "atl.resource.atl.ui.launchConfigurationType";
	}
	
	public atl.resource.atl.IAtlNameProvider createNameProvider() {
		return new atl.resource.atl.analysis.AtlDefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		atl.resource.atl.mopp.AtlAntlrTokenHelper tokenHelper = new atl.resource.atl.mopp.AtlAntlrTokenHelper();
		java.util.List<String> highlightableTokens = new java.util.ArrayList<String>();
		String[] parserTokenNames = getTokenNames();
		for (int i = 0; i < parserTokenNames.length; i++) {
			// If ANTLR is used we need to normalize the token names
			if (!tokenHelper.canBeUsedForSyntaxHighlighting(i)) {
				continue;
			}
			String tokenName = tokenHelper.getTokenName(parserTokenNames, i);
			if (tokenName == null) {
				continue;
			}
			highlightableTokens.add(tokenName);
		}
		highlightableTokens.add(atl.resource.atl.mopp.AtlTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
