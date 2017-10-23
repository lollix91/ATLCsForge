/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.mopp;

public class AtlReferenceResolverSwitch implements atl.resource.atl.IAtlReferenceResolverSwitch {
	
	/**
	 * This map stores a copy of the options the were set for loading the resource.
	 */
	private java.util.Map<Object, Object> options;
	
	protected atl.resource.atl.analysis.ModuleElementModuleReferenceResolver moduleElementModuleReferenceResolver = new atl.resource.atl.analysis.ModuleElementModuleReferenceResolver();
	protected atl.resource.atl.analysis.HelperQueryReferenceResolver helperQueryReferenceResolver = new atl.resource.atl.analysis.HelperQueryReferenceResolver();
	protected atl.resource.atl.analysis.HelperLibraryReferenceResolver helperLibraryReferenceResolver = new atl.resource.atl.analysis.HelperLibraryReferenceResolver();
	protected atl.resource.atl.analysis.MatchedRuleChildrenReferenceResolver matchedRuleChildrenReferenceResolver = new atl.resource.atl.analysis.MatchedRuleChildrenReferenceResolver();
	protected atl.resource.atl.analysis.MatchedRuleSuperRuleReferenceResolver matchedRuleSuperRuleReferenceResolver = new atl.resource.atl.analysis.MatchedRuleSuperRuleReferenceResolver();
	protected atl.resource.atl.analysis.InPatternRuleReferenceResolver inPatternRuleReferenceResolver = new atl.resource.atl.analysis.InPatternRuleReferenceResolver();
	protected atl.resource.atl.analysis.OutPatternRuleReferenceResolver outPatternRuleReferenceResolver = new atl.resource.atl.analysis.OutPatternRuleReferenceResolver();
	protected atl.resource.atl.analysis.DropPatternOutPatternReferenceResolver dropPatternOutPatternReferenceResolver = new atl.resource.atl.analysis.DropPatternOutPatternReferenceResolver();
	protected atl.resource.atl.analysis.VariableDeclarationLetExpReferenceResolver variableDeclarationLetExpReferenceResolver = new atl.resource.atl.analysis.VariableDeclarationLetExpReferenceResolver();
	protected atl.resource.atl.analysis.VariableDeclarationBaseExpReferenceResolver variableDeclarationBaseExpReferenceResolver = new atl.resource.atl.analysis.VariableDeclarationBaseExpReferenceResolver();
	protected atl.resource.atl.analysis.VariableDeclarationVariableExpReferenceResolver variableDeclarationVariableExpReferenceResolver = new atl.resource.atl.analysis.VariableDeclarationVariableExpReferenceResolver();
	protected atl.resource.atl.analysis.InPatternElementMapsToReferenceResolver inPatternElementMapsToReferenceResolver = new atl.resource.atl.analysis.InPatternElementMapsToReferenceResolver();
	protected atl.resource.atl.analysis.InPatternElementInPatternReferenceResolver inPatternElementInPatternReferenceResolver = new atl.resource.atl.analysis.InPatternElementInPatternReferenceResolver();
	protected atl.resource.atl.analysis.InPatternElementModelsReferenceResolver inPatternElementModelsReferenceResolver = new atl.resource.atl.analysis.InPatternElementModelsReferenceResolver();
	protected atl.resource.atl.analysis.OutPatternElementOutPatternReferenceResolver outPatternElementOutPatternReferenceResolver = new atl.resource.atl.analysis.OutPatternElementOutPatternReferenceResolver();
	protected atl.resource.atl.analysis.OutPatternElementSourceElementReferenceResolver outPatternElementSourceElementReferenceResolver = new atl.resource.atl.analysis.OutPatternElementSourceElementReferenceResolver();
	protected atl.resource.atl.analysis.OutPatternElementModelReferenceResolver outPatternElementModelReferenceResolver = new atl.resource.atl.analysis.OutPatternElementModelReferenceResolver();
	protected atl.resource.atl.analysis.BindingOutPatternElementReferenceResolver bindingOutPatternElementReferenceResolver = new atl.resource.atl.analysis.BindingOutPatternElementReferenceResolver();
	protected atl.resource.atl.analysis.RuleVariableDeclarationRuleReferenceResolver ruleVariableDeclarationRuleReferenceResolver = new atl.resource.atl.analysis.RuleVariableDeclarationRuleReferenceResolver();
	protected atl.resource.atl.analysis.LibraryRefUnitReferenceResolver libraryRefUnitReferenceResolver = new atl.resource.atl.analysis.LibraryRefUnitReferenceResolver();
	protected atl.resource.atl.analysis.ActionBlockRuleReferenceResolver actionBlockRuleReferenceResolver = new atl.resource.atl.analysis.ActionBlockRuleReferenceResolver();
	protected atl.resource.atl.analysis.OclExpressionIfExp3ReferenceResolver oclExpressionIfExp3ReferenceResolver = new atl.resource.atl.analysis.OclExpressionIfExp3ReferenceResolver();
	protected atl.resource.atl.analysis.OclExpressionAppliedPropertyReferenceResolver oclExpressionAppliedPropertyReferenceResolver = new atl.resource.atl.analysis.OclExpressionAppliedPropertyReferenceResolver();
	protected atl.resource.atl.analysis.OclExpressionCollectionReferenceResolver oclExpressionCollectionReferenceResolver = new atl.resource.atl.analysis.OclExpressionCollectionReferenceResolver();
	protected atl.resource.atl.analysis.OclExpressionLetExpReferenceResolver oclExpressionLetExpReferenceResolver = new atl.resource.atl.analysis.OclExpressionLetExpReferenceResolver();
	protected atl.resource.atl.analysis.OclExpressionLoopExpReferenceResolver oclExpressionLoopExpReferenceResolver = new atl.resource.atl.analysis.OclExpressionLoopExpReferenceResolver();
	protected atl.resource.atl.analysis.OclExpressionParentOperationReferenceResolver oclExpressionParentOperationReferenceResolver = new atl.resource.atl.analysis.OclExpressionParentOperationReferenceResolver();
	protected atl.resource.atl.analysis.OclExpressionInitializedVariableReferenceResolver oclExpressionInitializedVariableReferenceResolver = new atl.resource.atl.analysis.OclExpressionInitializedVariableReferenceResolver();
	protected atl.resource.atl.analysis.OclExpressionIfExp2ReferenceResolver oclExpressionIfExp2ReferenceResolver = new atl.resource.atl.analysis.OclExpressionIfExp2ReferenceResolver();
	protected atl.resource.atl.analysis.OclExpressionOwningOperationReferenceResolver oclExpressionOwningOperationReferenceResolver = new atl.resource.atl.analysis.OclExpressionOwningOperationReferenceResolver();
	protected atl.resource.atl.analysis.OclExpressionIfExp1ReferenceResolver oclExpressionIfExp1ReferenceResolver = new atl.resource.atl.analysis.OclExpressionIfExp1ReferenceResolver();
	protected atl.resource.atl.analysis.OclExpressionOwningAttributeReferenceResolver oclExpressionOwningAttributeReferenceResolver = new atl.resource.atl.analysis.OclExpressionOwningAttributeReferenceResolver();
	protected atl.resource.atl.analysis.VariableExpReferredVariableReferenceResolver variableExpReferredVariableReferenceResolver = new atl.resource.atl.analysis.VariableExpReferredVariableReferenceResolver();
	protected atl.resource.atl.analysis.TuplePartTupleReferenceResolver tuplePartTupleReferenceResolver = new atl.resource.atl.analysis.TuplePartTupleReferenceResolver();
	protected atl.resource.atl.analysis.MapElementMapReferenceResolver mapElementMapReferenceResolver = new atl.resource.atl.analysis.MapElementMapReferenceResolver();
	protected atl.resource.atl.analysis.IteratorLoopExprReferenceResolver iteratorLoopExprReferenceResolver = new atl.resource.atl.analysis.IteratorLoopExprReferenceResolver();
	protected atl.resource.atl.analysis.ParameterOperationReferenceResolver parameterOperationReferenceResolver = new atl.resource.atl.analysis.ParameterOperationReferenceResolver();
	protected atl.resource.atl.analysis.OclTypeDefinitionsReferenceResolver oclTypeDefinitionsReferenceResolver = new atl.resource.atl.analysis.OclTypeDefinitionsReferenceResolver();
	protected atl.resource.atl.analysis.OclTypeOclExpressionReferenceResolver oclTypeOclExpressionReferenceResolver = new atl.resource.atl.analysis.OclTypeOclExpressionReferenceResolver();
	protected atl.resource.atl.analysis.OclTypeOperationReferenceResolver oclTypeOperationReferenceResolver = new atl.resource.atl.analysis.OclTypeOperationReferenceResolver();
	protected atl.resource.atl.analysis.OclTypeMapType2ReferenceResolver oclTypeMapType2ReferenceResolver = new atl.resource.atl.analysis.OclTypeMapType2ReferenceResolver();
	protected atl.resource.atl.analysis.OclTypeAttributeReferenceResolver oclTypeAttributeReferenceResolver = new atl.resource.atl.analysis.OclTypeAttributeReferenceResolver();
	protected atl.resource.atl.analysis.OclTypeMapTypeReferenceResolver oclTypeMapTypeReferenceResolver = new atl.resource.atl.analysis.OclTypeMapTypeReferenceResolver();
	protected atl.resource.atl.analysis.OclTypeCollectionTypesReferenceResolver oclTypeCollectionTypesReferenceResolver = new atl.resource.atl.analysis.OclTypeCollectionTypesReferenceResolver();
	protected atl.resource.atl.analysis.OclTypeTupleTypeAttributeReferenceResolver oclTypeTupleTypeAttributeReferenceResolver = new atl.resource.atl.analysis.OclTypeTupleTypeAttributeReferenceResolver();
	protected atl.resource.atl.analysis.OclTypeVariableDeclarationReferenceResolver oclTypeVariableDeclarationReferenceResolver = new atl.resource.atl.analysis.OclTypeVariableDeclarationReferenceResolver();
	protected atl.resource.atl.analysis.TupleTypeAttributeTupleTypeReferenceResolver tupleTypeAttributeTupleTypeReferenceResolver = new atl.resource.atl.analysis.TupleTypeAttributeTupleTypeReferenceResolver();
	protected atl.resource.atl.analysis.OclModelElementModelReferenceResolver oclModelElementModelReferenceResolver = new atl.resource.atl.analysis.OclModelElementModelReferenceResolver();
	protected atl.resource.atl.analysis.OclContextDefinitionDefinitionReferenceResolver oclContextDefinitionDefinitionReferenceResolver = new atl.resource.atl.analysis.OclContextDefinitionDefinitionReferenceResolver();
	protected atl.resource.atl.analysis.OclFeatureDefinitionReferenceResolver oclFeatureDefinitionReferenceResolver = new atl.resource.atl.analysis.OclFeatureDefinitionReferenceResolver();
	protected atl.resource.atl.analysis.OclModelMetamodelReferenceResolver oclModelMetamodelReferenceResolver = new atl.resource.atl.analysis.OclModelMetamodelReferenceResolver();
	protected atl.resource.atl.analysis.OclModelElementsReferenceResolver oclModelElementsReferenceResolver = new atl.resource.atl.analysis.OclModelElementsReferenceResolver();
	protected atl.resource.atl.analysis.OclModelModelReferenceResolver oclModelModelReferenceResolver = new atl.resource.atl.analysis.OclModelModelReferenceResolver();
	
	public atl.resource.atl.IAtlReferenceResolver<atl.ModuleElement, atl.Module> getModuleElementModuleReferenceResolver() {
		return getResolverChain(atl.AtlPackage.eINSTANCE.getModuleElement_Module(), moduleElementModuleReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<atl.Helper, atl.Query> getHelperQueryReferenceResolver() {
		return getResolverChain(atl.AtlPackage.eINSTANCE.getHelper_Query(), helperQueryReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<atl.Helper, atl.Library> getHelperLibraryReferenceResolver() {
		return getResolverChain(atl.AtlPackage.eINSTANCE.getHelper_Library(), helperLibraryReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<atl.MatchedRule, atl.MatchedRule> getMatchedRuleChildrenReferenceResolver() {
		return getResolverChain(atl.AtlPackage.eINSTANCE.getMatchedRule_Children(), matchedRuleChildrenReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<atl.MatchedRule, atl.MatchedRule> getMatchedRuleSuperRuleReferenceResolver() {
		return getResolverChain(atl.AtlPackage.eINSTANCE.getMatchedRule_SuperRule(), matchedRuleSuperRuleReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<atl.InPattern, atl.MatchedRule> getInPatternRuleReferenceResolver() {
		return getResolverChain(atl.AtlPackage.eINSTANCE.getInPattern_Rule(), inPatternRuleReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<atl.OutPattern, atl.Rule> getOutPatternRuleReferenceResolver() {
		return getResolverChain(atl.AtlPackage.eINSTANCE.getOutPattern_Rule(), outPatternRuleReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<atl.DropPattern, atl.OutPattern> getDropPatternOutPatternReferenceResolver() {
		return getResolverChain(atl.AtlPackage.eINSTANCE.getDropPattern_OutPattern(), dropPatternOutPatternReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.VariableDeclaration, ocl.LetExp> getVariableDeclarationLetExpReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getVariableDeclaration_LetExp(), variableDeclarationLetExpReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.VariableDeclaration, ocl.IterateExp> getVariableDeclarationBaseExpReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getVariableDeclaration_BaseExp(), variableDeclarationBaseExpReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.VariableDeclaration, ocl.VariableExp> getVariableDeclarationVariableExpReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getVariableDeclaration_VariableExp(), variableDeclarationVariableExpReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<atl.InPatternElement, atl.OutPatternElement> getInPatternElementMapsToReferenceResolver() {
		return getResolverChain(atl.AtlPackage.eINSTANCE.getInPatternElement_MapsTo(), inPatternElementMapsToReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<atl.InPatternElement, atl.InPattern> getInPatternElementInPatternReferenceResolver() {
		return getResolverChain(atl.AtlPackage.eINSTANCE.getInPatternElement_InPattern(), inPatternElementInPatternReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<atl.InPatternElement, ocl.OclModel> getInPatternElementModelsReferenceResolver() {
		return getResolverChain(atl.AtlPackage.eINSTANCE.getInPatternElement_Models(), inPatternElementModelsReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<atl.OutPatternElement, atl.OutPattern> getOutPatternElementOutPatternReferenceResolver() {
		return getResolverChain(atl.AtlPackage.eINSTANCE.getOutPatternElement_OutPattern(), outPatternElementOutPatternReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<atl.OutPatternElement, atl.InPatternElement> getOutPatternElementSourceElementReferenceResolver() {
		return getResolverChain(atl.AtlPackage.eINSTANCE.getOutPatternElement_SourceElement(), outPatternElementSourceElementReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<atl.OutPatternElement, ocl.OclModel> getOutPatternElementModelReferenceResolver() {
		return getResolverChain(atl.AtlPackage.eINSTANCE.getOutPatternElement_Model(), outPatternElementModelReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<atl.Binding, atl.OutPatternElement> getBindingOutPatternElementReferenceResolver() {
		return getResolverChain(atl.AtlPackage.eINSTANCE.getBinding_OutPatternElement(), bindingOutPatternElementReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<atl.RuleVariableDeclaration, atl.Rule> getRuleVariableDeclarationRuleReferenceResolver() {
		return getResolverChain(atl.AtlPackage.eINSTANCE.getRuleVariableDeclaration_Rule(), ruleVariableDeclarationRuleReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<atl.LibraryRef, atl.Unit> getLibraryRefUnitReferenceResolver() {
		return getResolverChain(atl.AtlPackage.eINSTANCE.getLibraryRef_Unit(), libraryRefUnitReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<atl.ActionBlock, atl.Rule> getActionBlockRuleReferenceResolver() {
		return getResolverChain(atl.AtlPackage.eINSTANCE.getActionBlock_Rule(), actionBlockRuleReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.OclExpression, ocl.IfExp> getOclExpressionIfExp3ReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getOclExpression_IfExp3(), oclExpressionIfExp3ReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.OclExpression, ocl.PropertyCallExp> getOclExpressionAppliedPropertyReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getOclExpression_AppliedProperty(), oclExpressionAppliedPropertyReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.OclExpression, ocl.CollectionExp> getOclExpressionCollectionReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getOclExpression_Collection(), oclExpressionCollectionReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.OclExpression, ocl.LetExp> getOclExpressionLetExpReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getOclExpression_LetExp(), oclExpressionLetExpReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.OclExpression, ocl.LoopExp> getOclExpressionLoopExpReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getOclExpression_LoopExp(), oclExpressionLoopExpReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.OclExpression, ocl.OperationCallExp> getOclExpressionParentOperationReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getOclExpression_ParentOperation(), oclExpressionParentOperationReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.OclExpression, ocl.VariableDeclaration> getOclExpressionInitializedVariableReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getOclExpression_InitializedVariable(), oclExpressionInitializedVariableReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.OclExpression, ocl.IfExp> getOclExpressionIfExp2ReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getOclExpression_IfExp2(), oclExpressionIfExp2ReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.OclExpression, ocl.Operation> getOclExpressionOwningOperationReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getOclExpression_OwningOperation(), oclExpressionOwningOperationReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.OclExpression, ocl.IfExp> getOclExpressionIfExp1ReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getOclExpression_IfExp1(), oclExpressionIfExp1ReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.OclExpression, ocl.Attribute> getOclExpressionOwningAttributeReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getOclExpression_OwningAttribute(), oclExpressionOwningAttributeReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.VariableExp, ocl.VariableDeclaration> getVariableExpReferredVariableReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getVariableExp_ReferredVariable(), variableExpReferredVariableReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.TuplePart, ocl.TupleExp> getTuplePartTupleReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getTuplePart_Tuple(), tuplePartTupleReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.MapElement, ocl.MapExp> getMapElementMapReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getMapElement_Map(), mapElementMapReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.Iterator, ocl.LoopExp> getIteratorLoopExprReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getIterator_LoopExpr(), iteratorLoopExprReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.Parameter, ocl.Operation> getParameterOperationReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getParameter_Operation(), parameterOperationReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.OclType, ocl.OclContextDefinition> getOclTypeDefinitionsReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getOclType_Definitions(), oclTypeDefinitionsReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.OclType, ocl.OclExpression> getOclTypeOclExpressionReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getOclType_OclExpression(), oclTypeOclExpressionReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.OclType, ocl.Operation> getOclTypeOperationReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getOclType_Operation(), oclTypeOperationReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.OclType, ocl.MapType> getOclTypeMapType2ReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getOclType_MapType2(), oclTypeMapType2ReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.OclType, ocl.Attribute> getOclTypeAttributeReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getOclType_Attribute(), oclTypeAttributeReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.OclType, ocl.MapType> getOclTypeMapTypeReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getOclType_MapType(), oclTypeMapTypeReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.OclType, ocl.CollectionType> getOclTypeCollectionTypesReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getOclType_CollectionTypes(), oclTypeCollectionTypesReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.OclType, ocl.TupleTypeAttribute> getOclTypeTupleTypeAttributeReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getOclType_TupleTypeAttribute(), oclTypeTupleTypeAttributeReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.OclType, ocl.VariableDeclaration> getOclTypeVariableDeclarationReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getOclType_VariableDeclaration(), oclTypeVariableDeclarationReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.TupleTypeAttribute, ocl.TupleType> getTupleTypeAttributeTupleTypeReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getTupleTypeAttribute_TupleType(), tupleTypeAttributeTupleTypeReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.OclModelElement, ocl.OclModel> getOclModelElementModelReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getOclModelElement_Model(), oclModelElementModelReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.OclContextDefinition, ocl.OclFeatureDefinition> getOclContextDefinitionDefinitionReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getOclContextDefinition_Definition(), oclContextDefinitionDefinitionReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.OclFeature, ocl.OclFeatureDefinition> getOclFeatureDefinitionReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getOclFeature_Definition(), oclFeatureDefinitionReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.OclModel, ocl.OclModel> getOclModelMetamodelReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getOclModel_Metamodel(), oclModelMetamodelReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.OclModel, ocl.OclModelElement> getOclModelElementsReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getOclModel_Elements(), oclModelElementsReferenceResolver);
	}
	
	public atl.resource.atl.IAtlReferenceResolver<ocl.OclModel, ocl.OclModel> getOclModelModelReferenceResolver() {
		return getResolverChain(ocl.OclPackage.eINSTANCE.getOclModel_Model(), oclModelModelReferenceResolver);
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		if (options != null) {
			this.options = new java.util.LinkedHashMap<Object, Object>();
			this.options.putAll(options);
		}
		moduleElementModuleReferenceResolver.setOptions(options);
		helperQueryReferenceResolver.setOptions(options);
		helperLibraryReferenceResolver.setOptions(options);
		matchedRuleChildrenReferenceResolver.setOptions(options);
		matchedRuleSuperRuleReferenceResolver.setOptions(options);
		inPatternRuleReferenceResolver.setOptions(options);
		outPatternRuleReferenceResolver.setOptions(options);
		dropPatternOutPatternReferenceResolver.setOptions(options);
		variableDeclarationLetExpReferenceResolver.setOptions(options);
		variableDeclarationBaseExpReferenceResolver.setOptions(options);
		variableDeclarationVariableExpReferenceResolver.setOptions(options);
		inPatternElementMapsToReferenceResolver.setOptions(options);
		inPatternElementInPatternReferenceResolver.setOptions(options);
		inPatternElementModelsReferenceResolver.setOptions(options);
		outPatternElementOutPatternReferenceResolver.setOptions(options);
		outPatternElementSourceElementReferenceResolver.setOptions(options);
		outPatternElementModelReferenceResolver.setOptions(options);
		bindingOutPatternElementReferenceResolver.setOptions(options);
		ruleVariableDeclarationRuleReferenceResolver.setOptions(options);
		libraryRefUnitReferenceResolver.setOptions(options);
		actionBlockRuleReferenceResolver.setOptions(options);
		oclExpressionIfExp3ReferenceResolver.setOptions(options);
		oclExpressionAppliedPropertyReferenceResolver.setOptions(options);
		oclExpressionCollectionReferenceResolver.setOptions(options);
		oclExpressionLetExpReferenceResolver.setOptions(options);
		oclExpressionLoopExpReferenceResolver.setOptions(options);
		oclExpressionParentOperationReferenceResolver.setOptions(options);
		oclExpressionInitializedVariableReferenceResolver.setOptions(options);
		oclExpressionIfExp2ReferenceResolver.setOptions(options);
		oclExpressionOwningOperationReferenceResolver.setOptions(options);
		oclExpressionIfExp1ReferenceResolver.setOptions(options);
		oclExpressionOwningAttributeReferenceResolver.setOptions(options);
		variableExpReferredVariableReferenceResolver.setOptions(options);
		tuplePartTupleReferenceResolver.setOptions(options);
		mapElementMapReferenceResolver.setOptions(options);
		iteratorLoopExprReferenceResolver.setOptions(options);
		parameterOperationReferenceResolver.setOptions(options);
		oclTypeDefinitionsReferenceResolver.setOptions(options);
		oclTypeOclExpressionReferenceResolver.setOptions(options);
		oclTypeOperationReferenceResolver.setOptions(options);
		oclTypeMapType2ReferenceResolver.setOptions(options);
		oclTypeAttributeReferenceResolver.setOptions(options);
		oclTypeMapTypeReferenceResolver.setOptions(options);
		oclTypeCollectionTypesReferenceResolver.setOptions(options);
		oclTypeTupleTypeAttributeReferenceResolver.setOptions(options);
		oclTypeVariableDeclarationReferenceResolver.setOptions(options);
		tupleTypeAttributeTupleTypeReferenceResolver.setOptions(options);
		oclModelElementModelReferenceResolver.setOptions(options);
		oclContextDefinitionDefinitionReferenceResolver.setOptions(options);
		oclFeatureDefinitionReferenceResolver.setOptions(options);
		oclModelMetamodelReferenceResolver.setOptions(options);
		oclModelElementsReferenceResolver.setOptions(options);
		oclModelModelReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, atl.resource.atl.IAtlReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (atl.AtlPackage.eINSTANCE.getModuleElement().isInstance(container)) {
			AtlFuzzyResolveResult<atl.Module> frr = new AtlFuzzyResolveResult<atl.Module>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("module")) {
				moduleElementModuleReferenceResolver.resolve(identifier, (atl.ModuleElement) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (atl.AtlPackage.eINSTANCE.getHelper().isInstance(container)) {
			AtlFuzzyResolveResult<atl.Query> frr = new AtlFuzzyResolveResult<atl.Query>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("query")) {
				helperQueryReferenceResolver.resolve(identifier, (atl.Helper) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (atl.AtlPackage.eINSTANCE.getHelper().isInstance(container)) {
			AtlFuzzyResolveResult<atl.Library> frr = new AtlFuzzyResolveResult<atl.Library>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("library")) {
				helperLibraryReferenceResolver.resolve(identifier, (atl.Helper) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (atl.AtlPackage.eINSTANCE.getMatchedRule().isInstance(container)) {
			AtlFuzzyResolveResult<atl.MatchedRule> frr = new AtlFuzzyResolveResult<atl.MatchedRule>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("children")) {
				matchedRuleChildrenReferenceResolver.resolve(identifier, (atl.MatchedRule) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (atl.AtlPackage.eINSTANCE.getMatchedRule().isInstance(container)) {
			AtlFuzzyResolveResult<atl.MatchedRule> frr = new AtlFuzzyResolveResult<atl.MatchedRule>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("superRule")) {
				matchedRuleSuperRuleReferenceResolver.resolve(identifier, (atl.MatchedRule) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (atl.AtlPackage.eINSTANCE.getInPattern().isInstance(container)) {
			AtlFuzzyResolveResult<atl.MatchedRule> frr = new AtlFuzzyResolveResult<atl.MatchedRule>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("rule")) {
				inPatternRuleReferenceResolver.resolve(identifier, (atl.InPattern) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (atl.AtlPackage.eINSTANCE.getOutPattern().isInstance(container)) {
			AtlFuzzyResolveResult<atl.Rule> frr = new AtlFuzzyResolveResult<atl.Rule>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("rule")) {
				outPatternRuleReferenceResolver.resolve(identifier, (atl.OutPattern) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (atl.AtlPackage.eINSTANCE.getDropPattern().isInstance(container)) {
			AtlFuzzyResolveResult<atl.OutPattern> frr = new AtlFuzzyResolveResult<atl.OutPattern>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("outPattern")) {
				dropPatternOutPatternReferenceResolver.resolve(identifier, (atl.DropPattern) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getVariableDeclaration().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.LetExp> frr = new AtlFuzzyResolveResult<ocl.LetExp>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("letExp")) {
				variableDeclarationLetExpReferenceResolver.resolve(identifier, (ocl.VariableDeclaration) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getVariableDeclaration().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.IterateExp> frr = new AtlFuzzyResolveResult<ocl.IterateExp>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("baseExp")) {
				variableDeclarationBaseExpReferenceResolver.resolve(identifier, (ocl.VariableDeclaration) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getVariableDeclaration().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.VariableExp> frr = new AtlFuzzyResolveResult<ocl.VariableExp>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("variableExp")) {
				variableDeclarationVariableExpReferenceResolver.resolve(identifier, (ocl.VariableDeclaration) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (atl.AtlPackage.eINSTANCE.getInPatternElement().isInstance(container)) {
			AtlFuzzyResolveResult<atl.OutPatternElement> frr = new AtlFuzzyResolveResult<atl.OutPatternElement>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("mapsTo")) {
				inPatternElementMapsToReferenceResolver.resolve(identifier, (atl.InPatternElement) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (atl.AtlPackage.eINSTANCE.getInPatternElement().isInstance(container)) {
			AtlFuzzyResolveResult<atl.InPattern> frr = new AtlFuzzyResolveResult<atl.InPattern>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("inPattern")) {
				inPatternElementInPatternReferenceResolver.resolve(identifier, (atl.InPatternElement) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (atl.AtlPackage.eINSTANCE.getInPatternElement().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.OclModel> frr = new AtlFuzzyResolveResult<ocl.OclModel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("models")) {
				inPatternElementModelsReferenceResolver.resolve(identifier, (atl.InPatternElement) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (atl.AtlPackage.eINSTANCE.getOutPatternElement().isInstance(container)) {
			AtlFuzzyResolveResult<atl.OutPattern> frr = new AtlFuzzyResolveResult<atl.OutPattern>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("outPattern")) {
				outPatternElementOutPatternReferenceResolver.resolve(identifier, (atl.OutPatternElement) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (atl.AtlPackage.eINSTANCE.getOutPatternElement().isInstance(container)) {
			AtlFuzzyResolveResult<atl.InPatternElement> frr = new AtlFuzzyResolveResult<atl.InPatternElement>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("sourceElement")) {
				outPatternElementSourceElementReferenceResolver.resolve(identifier, (atl.OutPatternElement) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (atl.AtlPackage.eINSTANCE.getOutPatternElement().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.OclModel> frr = new AtlFuzzyResolveResult<ocl.OclModel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("model")) {
				outPatternElementModelReferenceResolver.resolve(identifier, (atl.OutPatternElement) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (atl.AtlPackage.eINSTANCE.getBinding().isInstance(container)) {
			AtlFuzzyResolveResult<atl.OutPatternElement> frr = new AtlFuzzyResolveResult<atl.OutPatternElement>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("outPatternElement")) {
				bindingOutPatternElementReferenceResolver.resolve(identifier, (atl.Binding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (atl.AtlPackage.eINSTANCE.getRuleVariableDeclaration().isInstance(container)) {
			AtlFuzzyResolveResult<atl.Rule> frr = new AtlFuzzyResolveResult<atl.Rule>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("rule")) {
				ruleVariableDeclarationRuleReferenceResolver.resolve(identifier, (atl.RuleVariableDeclaration) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (atl.AtlPackage.eINSTANCE.getLibraryRef().isInstance(container)) {
			AtlFuzzyResolveResult<atl.Unit> frr = new AtlFuzzyResolveResult<atl.Unit>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("unit")) {
				libraryRefUnitReferenceResolver.resolve(identifier, (atl.LibraryRef) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (atl.AtlPackage.eINSTANCE.getActionBlock().isInstance(container)) {
			AtlFuzzyResolveResult<atl.Rule> frr = new AtlFuzzyResolveResult<atl.Rule>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("rule")) {
				actionBlockRuleReferenceResolver.resolve(identifier, (atl.ActionBlock) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getOclExpression().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.IfExp> frr = new AtlFuzzyResolveResult<ocl.IfExp>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("ifExp3")) {
				oclExpressionIfExp3ReferenceResolver.resolve(identifier, (ocl.OclExpression) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getOclExpression().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.PropertyCallExp> frr = new AtlFuzzyResolveResult<ocl.PropertyCallExp>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("appliedProperty")) {
				oclExpressionAppliedPropertyReferenceResolver.resolve(identifier, (ocl.OclExpression) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getOclExpression().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.CollectionExp> frr = new AtlFuzzyResolveResult<ocl.CollectionExp>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("collection")) {
				oclExpressionCollectionReferenceResolver.resolve(identifier, (ocl.OclExpression) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getOclExpression().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.LetExp> frr = new AtlFuzzyResolveResult<ocl.LetExp>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("letExp")) {
				oclExpressionLetExpReferenceResolver.resolve(identifier, (ocl.OclExpression) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getOclExpression().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.LoopExp> frr = new AtlFuzzyResolveResult<ocl.LoopExp>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("loopExp")) {
				oclExpressionLoopExpReferenceResolver.resolve(identifier, (ocl.OclExpression) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getOclExpression().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.OperationCallExp> frr = new AtlFuzzyResolveResult<ocl.OperationCallExp>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("parentOperation")) {
				oclExpressionParentOperationReferenceResolver.resolve(identifier, (ocl.OclExpression) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getOclExpression().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.VariableDeclaration> frr = new AtlFuzzyResolveResult<ocl.VariableDeclaration>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("initializedVariable")) {
				oclExpressionInitializedVariableReferenceResolver.resolve(identifier, (ocl.OclExpression) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getOclExpression().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.IfExp> frr = new AtlFuzzyResolveResult<ocl.IfExp>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("ifExp2")) {
				oclExpressionIfExp2ReferenceResolver.resolve(identifier, (ocl.OclExpression) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getOclExpression().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.Operation> frr = new AtlFuzzyResolveResult<ocl.Operation>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("owningOperation")) {
				oclExpressionOwningOperationReferenceResolver.resolve(identifier, (ocl.OclExpression) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getOclExpression().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.IfExp> frr = new AtlFuzzyResolveResult<ocl.IfExp>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("ifExp1")) {
				oclExpressionIfExp1ReferenceResolver.resolve(identifier, (ocl.OclExpression) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getOclExpression().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.Attribute> frr = new AtlFuzzyResolveResult<ocl.Attribute>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("owningAttribute")) {
				oclExpressionOwningAttributeReferenceResolver.resolve(identifier, (ocl.OclExpression) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getVariableExp().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.VariableDeclaration> frr = new AtlFuzzyResolveResult<ocl.VariableDeclaration>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("referredVariable")) {
				variableExpReferredVariableReferenceResolver.resolve(identifier, (ocl.VariableExp) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getTuplePart().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.TupleExp> frr = new AtlFuzzyResolveResult<ocl.TupleExp>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("tuple")) {
				tuplePartTupleReferenceResolver.resolve(identifier, (ocl.TuplePart) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getMapElement().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.MapExp> frr = new AtlFuzzyResolveResult<ocl.MapExp>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("map")) {
				mapElementMapReferenceResolver.resolve(identifier, (ocl.MapElement) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getIterator().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.LoopExp> frr = new AtlFuzzyResolveResult<ocl.LoopExp>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("loopExpr")) {
				iteratorLoopExprReferenceResolver.resolve(identifier, (ocl.Iterator) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getParameter().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.Operation> frr = new AtlFuzzyResolveResult<ocl.Operation>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("operation")) {
				parameterOperationReferenceResolver.resolve(identifier, (ocl.Parameter) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getOclType().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.OclContextDefinition> frr = new AtlFuzzyResolveResult<ocl.OclContextDefinition>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("definitions")) {
				oclTypeDefinitionsReferenceResolver.resolve(identifier, (ocl.OclType) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getOclType().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.OclExpression> frr = new AtlFuzzyResolveResult<ocl.OclExpression>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("oclExpression")) {
				oclTypeOclExpressionReferenceResolver.resolve(identifier, (ocl.OclType) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getOclType().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.Operation> frr = new AtlFuzzyResolveResult<ocl.Operation>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("operation")) {
				oclTypeOperationReferenceResolver.resolve(identifier, (ocl.OclType) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getOclType().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.MapType> frr = new AtlFuzzyResolveResult<ocl.MapType>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("mapType2")) {
				oclTypeMapType2ReferenceResolver.resolve(identifier, (ocl.OclType) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getOclType().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.Attribute> frr = new AtlFuzzyResolveResult<ocl.Attribute>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("attribute")) {
				oclTypeAttributeReferenceResolver.resolve(identifier, (ocl.OclType) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getOclType().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.MapType> frr = new AtlFuzzyResolveResult<ocl.MapType>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("mapType")) {
				oclTypeMapTypeReferenceResolver.resolve(identifier, (ocl.OclType) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getOclType().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.CollectionType> frr = new AtlFuzzyResolveResult<ocl.CollectionType>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("collectionTypes")) {
				oclTypeCollectionTypesReferenceResolver.resolve(identifier, (ocl.OclType) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getOclType().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.TupleTypeAttribute> frr = new AtlFuzzyResolveResult<ocl.TupleTypeAttribute>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("tupleTypeAttribute")) {
				oclTypeTupleTypeAttributeReferenceResolver.resolve(identifier, (ocl.OclType) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getOclType().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.VariableDeclaration> frr = new AtlFuzzyResolveResult<ocl.VariableDeclaration>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("variableDeclaration")) {
				oclTypeVariableDeclarationReferenceResolver.resolve(identifier, (ocl.OclType) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getTupleTypeAttribute().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.TupleType> frr = new AtlFuzzyResolveResult<ocl.TupleType>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("tupleType")) {
				tupleTypeAttributeTupleTypeReferenceResolver.resolve(identifier, (ocl.TupleTypeAttribute) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getOclModelElement().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.OclModel> frr = new AtlFuzzyResolveResult<ocl.OclModel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("model")) {
				oclModelElementModelReferenceResolver.resolve(identifier, (ocl.OclModelElement) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getOclContextDefinition().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.OclFeatureDefinition> frr = new AtlFuzzyResolveResult<ocl.OclFeatureDefinition>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("definition")) {
				oclContextDefinitionDefinitionReferenceResolver.resolve(identifier, (ocl.OclContextDefinition) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getOclFeature().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.OclFeatureDefinition> frr = new AtlFuzzyResolveResult<ocl.OclFeatureDefinition>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("definition")) {
				oclFeatureDefinitionReferenceResolver.resolve(identifier, (ocl.OclFeature) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getOclModel().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.OclModel> frr = new AtlFuzzyResolveResult<ocl.OclModel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("metamodel")) {
				oclModelMetamodelReferenceResolver.resolve(identifier, (ocl.OclModel) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getOclModel().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.OclModelElement> frr = new AtlFuzzyResolveResult<ocl.OclModelElement>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("elements")) {
				oclModelElementsReferenceResolver.resolve(identifier, (ocl.OclModel) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ocl.OclPackage.eINSTANCE.getOclModel().isInstance(container)) {
			AtlFuzzyResolveResult<ocl.OclModel> frr = new AtlFuzzyResolveResult<ocl.OclModel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("model")) {
				oclModelModelReferenceResolver.resolve(identifier, (ocl.OclModel) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
	
	public atl.resource.atl.IAtlReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == atl.AtlPackage.eINSTANCE.getModuleElement_Module()) {
			return getResolverChain(reference, moduleElementModuleReferenceResolver);
		}
		if (reference == atl.AtlPackage.eINSTANCE.getHelper_Query()) {
			return getResolverChain(reference, helperQueryReferenceResolver);
		}
		if (reference == atl.AtlPackage.eINSTANCE.getHelper_Library()) {
			return getResolverChain(reference, helperLibraryReferenceResolver);
		}
		if (reference == atl.AtlPackage.eINSTANCE.getMatchedRule_Children()) {
			return getResolverChain(reference, matchedRuleChildrenReferenceResolver);
		}
		if (reference == atl.AtlPackage.eINSTANCE.getMatchedRule_SuperRule()) {
			return getResolverChain(reference, matchedRuleSuperRuleReferenceResolver);
		}
		if (reference == atl.AtlPackage.eINSTANCE.getInPattern_Rule()) {
			return getResolverChain(reference, inPatternRuleReferenceResolver);
		}
		if (reference == atl.AtlPackage.eINSTANCE.getOutPattern_Rule()) {
			return getResolverChain(reference, outPatternRuleReferenceResolver);
		}
		if (reference == atl.AtlPackage.eINSTANCE.getDropPattern_OutPattern()) {
			return getResolverChain(reference, dropPatternOutPatternReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getVariableDeclaration_LetExp()) {
			return getResolverChain(reference, variableDeclarationLetExpReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getVariableDeclaration_BaseExp()) {
			return getResolverChain(reference, variableDeclarationBaseExpReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getVariableDeclaration_VariableExp()) {
			return getResolverChain(reference, variableDeclarationVariableExpReferenceResolver);
		}
		if (reference == atl.AtlPackage.eINSTANCE.getInPatternElement_MapsTo()) {
			return getResolverChain(reference, inPatternElementMapsToReferenceResolver);
		}
		if (reference == atl.AtlPackage.eINSTANCE.getInPatternElement_InPattern()) {
			return getResolverChain(reference, inPatternElementInPatternReferenceResolver);
		}
		if (reference == atl.AtlPackage.eINSTANCE.getInPatternElement_Models()) {
			return getResolverChain(reference, inPatternElementModelsReferenceResolver);
		}
		if (reference == atl.AtlPackage.eINSTANCE.getOutPatternElement_OutPattern()) {
			return getResolverChain(reference, outPatternElementOutPatternReferenceResolver);
		}
		if (reference == atl.AtlPackage.eINSTANCE.getOutPatternElement_SourceElement()) {
			return getResolverChain(reference, outPatternElementSourceElementReferenceResolver);
		}
		if (reference == atl.AtlPackage.eINSTANCE.getOutPatternElement_Model()) {
			return getResolverChain(reference, outPatternElementModelReferenceResolver);
		}
		if (reference == atl.AtlPackage.eINSTANCE.getBinding_OutPatternElement()) {
			return getResolverChain(reference, bindingOutPatternElementReferenceResolver);
		}
		if (reference == atl.AtlPackage.eINSTANCE.getRuleVariableDeclaration_Rule()) {
			return getResolverChain(reference, ruleVariableDeclarationRuleReferenceResolver);
		}
		if (reference == atl.AtlPackage.eINSTANCE.getLibraryRef_Unit()) {
			return getResolverChain(reference, libraryRefUnitReferenceResolver);
		}
		if (reference == atl.AtlPackage.eINSTANCE.getActionBlock_Rule()) {
			return getResolverChain(reference, actionBlockRuleReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getOclExpression_IfExp3()) {
			return getResolverChain(reference, oclExpressionIfExp3ReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getOclExpression_AppliedProperty()) {
			return getResolverChain(reference, oclExpressionAppliedPropertyReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getOclExpression_Collection()) {
			return getResolverChain(reference, oclExpressionCollectionReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getOclExpression_LetExp()) {
			return getResolverChain(reference, oclExpressionLetExpReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getOclExpression_LoopExp()) {
			return getResolverChain(reference, oclExpressionLoopExpReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getOclExpression_ParentOperation()) {
			return getResolverChain(reference, oclExpressionParentOperationReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getOclExpression_InitializedVariable()) {
			return getResolverChain(reference, oclExpressionInitializedVariableReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getOclExpression_IfExp2()) {
			return getResolverChain(reference, oclExpressionIfExp2ReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getOclExpression_OwningOperation()) {
			return getResolverChain(reference, oclExpressionOwningOperationReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getOclExpression_IfExp1()) {
			return getResolverChain(reference, oclExpressionIfExp1ReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getOclExpression_OwningAttribute()) {
			return getResolverChain(reference, oclExpressionOwningAttributeReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getVariableExp_ReferredVariable()) {
			return getResolverChain(reference, variableExpReferredVariableReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getTuplePart_Tuple()) {
			return getResolverChain(reference, tuplePartTupleReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getMapElement_Map()) {
			return getResolverChain(reference, mapElementMapReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getIterator_LoopExpr()) {
			return getResolverChain(reference, iteratorLoopExprReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getParameter_Operation()) {
			return getResolverChain(reference, parameterOperationReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getOclType_Definitions()) {
			return getResolverChain(reference, oclTypeDefinitionsReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getOclType_OclExpression()) {
			return getResolverChain(reference, oclTypeOclExpressionReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getOclType_Operation()) {
			return getResolverChain(reference, oclTypeOperationReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getOclType_MapType2()) {
			return getResolverChain(reference, oclTypeMapType2ReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getOclType_Attribute()) {
			return getResolverChain(reference, oclTypeAttributeReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getOclType_MapType()) {
			return getResolverChain(reference, oclTypeMapTypeReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getOclType_CollectionTypes()) {
			return getResolverChain(reference, oclTypeCollectionTypesReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getOclType_TupleTypeAttribute()) {
			return getResolverChain(reference, oclTypeTupleTypeAttributeReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getOclType_VariableDeclaration()) {
			return getResolverChain(reference, oclTypeVariableDeclarationReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getTupleTypeAttribute_TupleType()) {
			return getResolverChain(reference, tupleTypeAttributeTupleTypeReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getOclModelElement_Model()) {
			return getResolverChain(reference, oclModelElementModelReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getOclContextDefinition_Definition()) {
			return getResolverChain(reference, oclContextDefinitionDefinitionReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getOclFeature_Definition()) {
			return getResolverChain(reference, oclFeatureDefinitionReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getOclModel_Metamodel()) {
			return getResolverChain(reference, oclModelMetamodelReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getOclModel_Elements()) {
			return getResolverChain(reference, oclModelElementsReferenceResolver);
		}
		if (reference == ocl.OclPackage.eINSTANCE.getOclModel_Model()) {
			return getResolverChain(reference, oclModelModelReferenceResolver);
		}
		return null;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})	
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> atl.resource.atl.IAtlReferenceResolver<ContainerType, ReferenceType> getResolverChain(org.eclipse.emf.ecore.EStructuralFeature reference, atl.resource.atl.IAtlReferenceResolver<ContainerType, ReferenceType> originalResolver) {
		if (options == null) {
			return originalResolver;
		}
		Object value = options.get(atl.resource.atl.IAtlOptions.ADDITIONAL_REFERENCE_RESOLVERS);
		if (value == null) {
			return originalResolver;
		}
		if (!(value instanceof java.util.Map)) {
			// send this to the error log
			new atl.resource.atl.util.AtlRuntimeUtil().logWarning("Found value with invalid type for option " + atl.resource.atl.IAtlOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + java.util.Map.class.getName() + ", but was " + value.getClass().getName() + ")", null);
			return originalResolver;
		}
		java.util.Map<?,?> resolverMap = (java.util.Map<?,?>) value;
		Object resolverValue = resolverMap.get(reference);
		if (resolverValue == null) {
			return originalResolver;
		}
		if (resolverValue instanceof atl.resource.atl.IAtlReferenceResolver) {
			atl.resource.atl.IAtlReferenceResolver replacingResolver = (atl.resource.atl.IAtlReferenceResolver) resolverValue;
			if (replacingResolver instanceof atl.resource.atl.IAtlDelegatingReferenceResolver) {
				// pass original resolver to the replacing one
				((atl.resource.atl.IAtlDelegatingReferenceResolver) replacingResolver).setDelegate(originalResolver);
			}
			return replacingResolver;
		} else if (resolverValue instanceof java.util.Collection) {
			java.util.Collection replacingResolvers = (java.util.Collection) resolverValue;
			atl.resource.atl.IAtlReferenceResolver replacingResolver = originalResolver;
			for (Object next : replacingResolvers) {
				if (next instanceof atl.resource.atl.IAtlReferenceCache) {
					atl.resource.atl.IAtlReferenceResolver nextResolver = (atl.resource.atl.IAtlReferenceResolver) next;
					if (nextResolver instanceof atl.resource.atl.IAtlDelegatingReferenceResolver) {
						// pass original resolver to the replacing one
						((atl.resource.atl.IAtlDelegatingReferenceResolver) nextResolver).setDelegate(replacingResolver);
					}
					replacingResolver = nextResolver;
				} else {
					// The collection contains a non-resolver. Send a warning to the error log.
					new atl.resource.atl.util.AtlRuntimeUtil().logWarning("Found value with invalid type in value map for option " + atl.resource.atl.IAtlOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + atl.resource.atl.IAtlDelegatingReferenceResolver.class.getName() + ", but was " + next.getClass().getName() + ")", null);
				}
			}
			return replacingResolver;
		} else {
			// The value for the option ADDITIONAL_REFERENCE_RESOLVERS has an unknown type.
			new atl.resource.atl.util.AtlRuntimeUtil().logWarning("Found value with invalid type in value map for option " + atl.resource.atl.IAtlOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + atl.resource.atl.IAtlDelegatingReferenceResolver.class.getName() + ", but was " + resolverValue.getClass().getName() + ")", null);
			return originalResolver;
		}
	}
	
}
