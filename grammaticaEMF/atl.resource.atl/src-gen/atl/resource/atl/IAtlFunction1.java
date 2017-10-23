/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl;

/**
 * A simple interface for generic functions with one argument.
 */
public interface IAtlFunction1<ReturnType, ArgumentType1> {
	
	public ReturnType execute(ArgumentType1 argument1);
}
