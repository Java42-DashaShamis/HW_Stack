package telran.util;

import java.util.NoSuchElementException;
import java.util.Stack;

//complexity O[1]

public class MyStack {
	//fields
	private Stack<Integer> myStack;
	private static Stack<Integer> maxStack = new Stack<>();;
	public MyStack(){
		this.myStack = new Stack<>();
	}
	
	//removes the last element and returns it
	//if stack is empty an exception "NoSuchElementException" should be thrown
	Integer pop() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		maxStack.pop();
		return myStack.pop();
	}
	
	//returns true if the stack is empty
	boolean isEmpty() {
		return myStack.isEmpty();
	}
	
	//pushes element to the end of the stack
	void push(Integer element) {
		myStack.push(element);
		if(maxStack.isEmpty() || element >= maxStack.peek()) {
			maxStack.push(element);
		}else {
			maxStack.push(maxStack.peek());
		}
	}
	
	//returns maximal element in the stack
	Integer max() {
		
		return maxStack.peek();
	}
}
