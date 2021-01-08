package stack;

public class Stack {

	int size = 10;
	int[] stack = new int[size];
	int top = -1;
	
	void push(int value) {
		if (isNotFull()) {
			top++;
			stack[top] = value;
		} else {
			System.out.println("Stack Overflow");
		}
		
	}
	
	
	int pop() {
		if (isEmpty()) {
			System.out.println("Stack underflow");
			return -1;
		} else {
			top--;
			return stack[top+1];
		}
		
	}
	
	int peak() {
		return top + 1;
	}
	
	void printStack() {
		System.out.print("Stack:");
		for (int i = 0; i <= top; i++ ) {
			System.out.print(stack[i] + ",");
		}
		System.out.println();
		
		
	}
	
	boolean isNotFull() {
		return top != size - 1;
	}
	
	boolean isEmpty() {
		return top == -1;
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.printStack();
		System.out.println("------After pop------");
		stack.pop();
		stack.printStack();
		
	}
	
}



