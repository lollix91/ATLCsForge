/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.mopp;

public class AtlSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			atl.AtlPackage.eINSTANCE.getUnit(),
			atl.AtlPackage.eINSTANCE.getLibrary(),
			atl.AtlPackage.eINSTANCE.getQuery(),
			atl.AtlPackage.eINSTANCE.getModule(),
			atl.AtlPackage.eINSTANCE.getHelper(),
			atl.AtlPackage.eINSTANCE.getMatchedRule(),
			atl.AtlPackage.eINSTANCE.getLazyMatchedRule(),
			atl.AtlPackage.eINSTANCE.getCalledRule(),
			atl.AtlPackage.eINSTANCE.getInPattern(),
			atl.AtlPackage.eINSTANCE.getOutPattern(),
			atl.AtlPackage.eINSTANCE.getDropPattern(),
			atl.AtlPackage.eINSTANCE.getSimpleInPatternElement(),
			atl.AtlPackage.eINSTANCE.getSimpleOutPatternElement(),
			atl.AtlPackage.eINSTANCE.getForEachOutPatternElement(),
			atl.AtlPackage.eINSTANCE.getBinding(),
			atl.AtlPackage.eINSTANCE.getRuleVariableDeclaration(),
			atl.AtlPackage.eINSTANCE.getLibraryRef(),
			atl.AtlPackage.eINSTANCE.getActionBlock(),
			atl.AtlPackage.eINSTANCE.getExpressionStat(),
			atl.AtlPackage.eINSTANCE.getBindingStat(),
			atl.AtlPackage.eINSTANCE.getIfStat(),
			atl.AtlPackage.eINSTANCE.getForStat(),
			ocl.OclPackage.eINSTANCE.getVariableExp(),
			ocl.OclPackage.eINSTANCE.getSuperExp(),
			ocl.OclPackage.eINSTANCE.getStringExp(),
			ocl.OclPackage.eINSTANCE.getBooleanExp(),
			ocl.OclPackage.eINSTANCE.getRealExp(),
			ocl.OclPackage.eINSTANCE.getIntegerExp(),
			ocl.OclPackage.eINSTANCE.getBagExp(),
			ocl.OclPackage.eINSTANCE.getOrderedSetExp(),
			ocl.OclPackage.eINSTANCE.getSequenceExp(),
			ocl.OclPackage.eINSTANCE.getSetExp(),
			ocl.OclPackage.eINSTANCE.getTupleExp(),
			ocl.OclPackage.eINSTANCE.getTuplePart(),
			ocl.OclPackage.eINSTANCE.getMapExp(),
			ocl.OclPackage.eINSTANCE.getMapElement(),
			ocl.OclPackage.eINSTANCE.getEnumLiteralExp(),
			ocl.OclPackage.eINSTANCE.getOclUndefinedExp(),
			ocl.OclPackage.eINSTANCE.getNavigationOrAttributeCallExp(),
			ocl.OclPackage.eINSTANCE.getOperationCallExp(),
			ocl.OclPackage.eINSTANCE.getOperatorCallExp(),
			ocl.OclPackage.eINSTANCE.getCollectionOperationCallExp(),
			ocl.OclPackage.eINSTANCE.getIterateExp(),
			ocl.OclPackage.eINSTANCE.getIteratorExp(),
			ocl.OclPackage.eINSTANCE.getLetExp(),
			ocl.OclPackage.eINSTANCE.getIfExp(),
			ocl.OclPackage.eINSTANCE.getVariableDeclaration(),
			ocl.OclPackage.eINSTANCE.getIterator(),
			ocl.OclPackage.eINSTANCE.getParameter(),
			ocl.OclPackage.eINSTANCE.getCollectionType(),
			ocl.OclPackage.eINSTANCE.getOclType(),
			ocl.OclPackage.eINSTANCE.getStringType(),
			ocl.OclPackage.eINSTANCE.getBooleanType(),
			ocl.OclPackage.eINSTANCE.getIntegerType(),
			ocl.OclPackage.eINSTANCE.getRealType(),
			ocl.OclPackage.eINSTANCE.getBagType(),
			ocl.OclPackage.eINSTANCE.getOrderedSetType(),
			ocl.OclPackage.eINSTANCE.getSequenceType(),
			ocl.OclPackage.eINSTANCE.getSetType(),
			ocl.OclPackage.eINSTANCE.getOclAnyType(),
			ocl.OclPackage.eINSTANCE.getTupleType(),
			ocl.OclPackage.eINSTANCE.getTupleTypeAttribute(),
			ocl.OclPackage.eINSTANCE.getOclModelElement(),
			ocl.OclPackage.eINSTANCE.getMapType(),
			ocl.OclPackage.eINSTANCE.getOclFeatureDefinition(),
			ocl.OclPackage.eINSTANCE.getOclContextDefinition(),
			ocl.OclPackage.eINSTANCE.getAttribute(),
			ocl.OclPackage.eINSTANCE.getOperation(),
			ocl.OclPackage.eINSTANCE.getOclModel(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			atl.AtlPackage.eINSTANCE.getUnit(),
			atl.AtlPackage.eINSTANCE.getLibrary(),
			atl.AtlPackage.eINSTANCE.getQuery(),
			atl.AtlPackage.eINSTANCE.getModule(),
			ocl.OclPackage.eINSTANCE.getOclFeatureDefinition(),
			ocl.OclPackage.eINSTANCE.getOclModel(),
		};
	}
	
}
