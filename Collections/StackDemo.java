package com.dev;
import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		stack.add(1);
		stack.add(5);
		stack.add(2);
		stack.add(4);
		stack.add(3);
		stack.push(33);
		stack.push(44);
		stack.push(66);
		
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
	}

}
