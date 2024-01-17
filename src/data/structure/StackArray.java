package data.structure;
/**
 * Stack implementation using Array
 * Stores a collection of objects insert and remove according LIFO principle
 * @author CYPRIAN DAVIS
 *
 * @param <T>
 */

public class StackArray<T> implements Stack<T>{
	private T[] data;	//Array used for storage

	private int index= -1; //Index of the elements on the stack
	
	@SuppressWarnings("unchecked")
	public StackArray(int capcity) {
		data = (T[]) new Object[capcity];
	}


	@Override
	public void push(T e) throws IllegalStateException {
		// TODO Auto-generated method stub
		if(size()== data.length) throw new IllegalStateException("Stack is full");
		data[++index] =e;
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		if(isEmpty()) return null;
		T element = data[index];
		index--;
		return element;
	}

	@Override
	public T top() {
		// TODO Auto-generated method stub
		if(isEmpty())
			return null;
		
		return data[index];
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return index+1;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return index == -1;
	}
	

}
