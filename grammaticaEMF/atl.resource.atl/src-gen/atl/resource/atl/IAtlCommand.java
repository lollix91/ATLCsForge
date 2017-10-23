/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IAtlCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
