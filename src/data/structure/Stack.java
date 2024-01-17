package data.structure;
/**
 * Stack ADT Interface
 * Collection of objects inserted and removed according LIFO principle
 * that is Lasr in first out
 * @author CYPRIAN DAVIS
 *
 * @param <T>
 */

public interface Stack<T> {
	/**
	 * Adds element e to the top of the stack
	 * @param e
	 */
	public void push(T e);
	/**
	 * Removes and returns the top element from the stack (or null if stack is empty)
	 * @return
	 */
	public T pop();
	/**
	 * Returns the top element from the stack 
	 * without removing it (or null if stack is empty)
	 * @return
	 */
	public T top();
	/**
	 * Returns the number of elements in the stack
	 * @return
	 */
	public int size();
	/**
	 * Returns a boolean indicating whether the stack is empty
	 * @return
	 */
	public boolean isEmpty();

}
