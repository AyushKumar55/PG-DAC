package day4;

import java.util.Stack;

public class PostfixEvaluation {

	public static int calc(int a, int b, char sym) {
		switch (sym) {
		case '$':
			return (int) Math.pow(a, b);
		case '^':
			return (int) Math.pow(a, b);
		case '/':
			return a / b;
		case '%':
			return a % b;
		case '*':
			return a * b;
		case '+':
			return a + b;
		case '-':
			return a - b;
		}
		return 0;
	}

	public static int solvePostfix(String postfix) {
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i < postfix.length(); i++) {
			char sym = postfix.charAt(i);
			if (Character.isDigit(sym)) {
				String operand = Character.toString(sym);
				s.push(Integer.parseInt(operand));
			} else {
				int b = s.pop();
				int a = s.pop();
				int c = calc(a, b, sym);
				s.push(c);
			}
		}
		return s.pop();
	}

	public static int priority(char operator) {
		switch (operator) {
		case '$':
			return 3;
		case '*':
			return 2;
		case '/':
			return 2;
		case '%':
			return 2;
		case '+':
			return 1;
		case '-':
			return 1;
		}
		return 0;
	}

	public static String infixToPostfix(String infix) {
		Stack<Character> s = new Stack<>();
		StringBuilder postfix = new StringBuilder();
		// 1. traverse infix exp. from left to right
		for (int i = 0; i < infix.length(); i++) {
			char sym = infix.charAt(i); // sym can be operand, (, ) or opearator
			// 2. if operand is found, append to postfix
			if (Character.isDigit(sym))
				postfix.append(sym);
			else if (sym == '(') // 4. if opening ( is found, then push it on stack
				s.push(sym);
			else if (sym == ')') {
				// 5. if closing ) is found, pop all operators from stack one by one and append
				// to postfix until opening ( is found.
				while (s.peek() != '(')
					postfix.append(s.pop());
				// also pop and discard opening (.
				s.pop();
			}
			// 3. if operator is found, push it on the stack,
			else {
				// if priority of topmost operator from stack >= priority of current operator
				while (!s.isEmpty() && priority(s.peek()) >= priority(sym)) {
					// pop operator from stack and append to postfix.
					postfix.append(s.pop());
				}
				s.push(sym);
			}
		} // end of for loop
		// 6. when all syms from infix are done, pop all operators from stack one by one
		// and append to postfix
		while (!s.isEmpty())
			postfix.append(s.pop());
		return postfix.toString();

	}

	public static void main(String[] args) {
		String infix = "5+9-4*(8-6/2)+1$(7-3)";
		String postfix = infixToPostfix(infix);
		System.out.println("Postfix: " + postfix);
		int result = solvePostfix(postfix);
		System.out.println("Result = " + result);
	}
}