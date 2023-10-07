/**
 * 
 */
package mystack;

import org.w3c.dom.Node;

/**
 * @author Amogh
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	
	private MyNode<T> theStack = null;
    private MyNode<T> top;
	/**
	 * 
	 */
	public MyStack() {
        top = null;
	}

	public T pop() {
		// TODO To complete
		MyNode<T> temp = null;
		if(top != null) {
			if(top.next != null ) {
				temp = top;
				top = top.next;
				
			} else {
				temp = top;
				top = null;
			}
		}
		return temp.val;
	}
	
	

	public void push(T v) {
		// TODO To complete
		MyNode<T> node = new MyNode<T>(v, top);
	if(top == null) {
		top = node;
		
	} else {
		node.next = top;
		top = node;
		
		
	}
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		MyStack<Integer> num = new MyStack<Integer>();
		num.push(1);
		num.push(2);
		num.pop();
		System.out.println("The number removed: " + num.pop());
		num.push(5);
		// Push 1 and 2
		// Pop
		// Push 5
		
		// TODO To complete
		// Create a stack of Person
		MyStack<String> person = new MyStack<String>();
		person.push("Amogh");
		person.push("Pride");
		System.out.println("The person removed " + person.pop());
		// Push a person p1 with your name
		// Push a person p2 with my name
	}

}
