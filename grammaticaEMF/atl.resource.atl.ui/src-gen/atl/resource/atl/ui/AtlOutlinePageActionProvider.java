/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.ui;

public class AtlOutlinePageActionProvider {
	
	public java.util.List<org.eclipse.jface.action.IAction> getActions(atl.resource.atl.ui.AtlOutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		java.util.List<org.eclipse.jface.action.IAction> defaultActions = new java.util.ArrayList<org.eclipse.jface.action.IAction>();
		defaultActions.add(new atl.resource.atl.ui.AtlOutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new atl.resource.atl.ui.AtlOutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new atl.resource.atl.ui.AtlOutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new atl.resource.atl.ui.AtlOutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new atl.resource.atl.ui.AtlOutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new atl.resource.atl.ui.AtlOutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
