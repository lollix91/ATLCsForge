/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.mopp;

/**
 * The AtlTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class AtlTokenResolverFactory implements atl.resource.atl.IAtlTokenResolverFactory {
	
	private java.util.Map<String, atl.resource.atl.IAtlTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, atl.resource.atl.IAtlTokenResolver> featureName2CollectInTokenResolver;
	private static atl.resource.atl.IAtlTokenResolver defaultResolver = new atl.resource.atl.analysis.AtlDefaultTokenResolver();
	
	public AtlTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, atl.resource.atl.IAtlTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, atl.resource.atl.IAtlTokenResolver>();
		registerTokenResolver("INTEGER", new atl.resource.atl.analysis.AtlINTEGERTokenResolver());
		registerTokenResolver("FLOAT", new atl.resource.atl.analysis.AtlFLOATTokenResolver());
		registerTokenResolver("TEXT", new atl.resource.atl.analysis.AtlTEXTTokenResolver());
		registerTokenResolver("QUOTED_34_34", new atl.resource.atl.analysis.AtlQUOTED_34_34TokenResolver());
	}
	
	public atl.resource.atl.IAtlTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public atl.resource.atl.IAtlTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, atl.resource.atl.IAtlTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, atl.resource.atl.IAtlTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected atl.resource.atl.IAtlTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private atl.resource.atl.IAtlTokenResolver internalCreateResolver(java.util.Map<String, atl.resource.atl.IAtlTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, atl.resource.atl.IAtlTokenResolver> resolverMap, String key, atl.resource.atl.IAtlTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
