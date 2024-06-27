package day5;

import java.util.Stack;

public class PrefixEvaluation {

	public static int calc(int a, int b, char sym) {
		switch(sym) {
		case '$': return (int)Math.pow(a, b);
		case '^': return (int)Math.pow(a, b);
		case '/': return a/b;
		case '%': return a%b;
		case '*': return a*b;
		case '+': return a+b;
		case '-': return a-b;
		}
		return 0;
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

	public static String infixToPrefix(String infix) {
		Stack<Character> s = new Stack<>();
		StringBuilder prefix = new StringBuilder();
		// 1. traverse infix exp. from right to left
		for (int i = infix.length()-1; i >= 0; i--) {
			char sym = infix.charAt(i); // sym can be operand, (, ) or opearator
			// 2. if operand is found, append to postfix
			if (Character.isDigit(sym))
				prefix.append(sym);
			else if (sym == ')') // 4. if closing ( is found, then push it on stack
				s.push(sym);
			else if (sym == '(') {
				// 5. if opening ( is found, pop all operators from stack one by one and append
				// to postfix until closing ) is found.
				while (s.peek() != ')')
					prefix.append(s.pop());
				// also pop and discard closing ).
				s.pop();
			}
			// 3. if operator is found, push it on the stack,
			else {
				// if priority of topmost operator from stack > priority of current operator
				while (!s.isEmpty() && priority(s.peek()) > priority(sym)) {
					// pop operator from stack and append to postfix.
					prefix.append(s.pop());
				}
				s.push(sym);
			}
		} // end of for loop
		// 6. when all syms from infix are done, pop all operators from stack one by one
		// and append to postfix
		while (!s.isEmpty())
			prefix.append(s.pop());
		// 7. Reverse the prefix and then return it
		return prefix.reverse().toString();

	}
	
	public static int solvePrefix(String prefix) {
		Stack<Integer> s = new Stack<>();
		for(int i = prefix.length()-1; i >= 0; i--) {
			char sym = prefix.charAt(i);
			if(Character.isDigit(sym)) {
				String operand = Character.toString(sym);
				s.push(Integer.parseInt(operand));
			}
			else {
				int a = s.pop();
				int b = s.pop();
				int c = calc(a, b, sym);
				s.push(c);
			}
		}
		return s.pop();
	}
	
	public static void main(String[] args) {
		String infix = "5+9-4*(8-6/2)+1$(7-3)";
		String prefix = infixToPrefix(infix);
		System.out.println("Prefix: " + prefix);
		int result = solvePrefix(prefix);
		System.out.println("Result = "+result);
	}
}
