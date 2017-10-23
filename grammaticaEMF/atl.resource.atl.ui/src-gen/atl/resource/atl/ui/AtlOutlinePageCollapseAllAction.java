/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.ui;

public class AtlOutlinePageCollapseAllAction extends atl.resource.atl.ui.AbstractAtlOutlinePageAction {
	
	public AtlOutlinePageCollapseAllAction(atl.resource.atl.ui.AtlOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Collapse all", org.eclipse.jface.action.IAction.AS_PUSH_BUTTON);
		initialize("icons/collapse_all_icon.gif");
	}
	
	public void runInternal(boolean on) {
		if (on) {
			getTreeViewer().collapseAll();
		}
	}
	
	public boolean keepState() {
		return false;
	}
	
}
