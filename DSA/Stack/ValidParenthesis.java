package day5;

import java.util.Stack;

public class ValidParenthesis {

	public static boolean isValid(String str) {

		//optimal approach
		Stack<Character> stack = new Stack<Character>();
		for (char c : str.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();

//		Stack<Character> s = new Stack<>();
//		String open = "({[", close = ")}]";
//		// 1. traverse the string left to right
//		for (int i = 0; i < str.length(); i++) {
//			char sym = str.charAt(i);
//			// 2. if opening parenthesis is found, push it on stack
//			if (open.indexOf(sym) != -1) {
//				s.push(sym);
//			}
//			// 3. if closing parenthesis is found,
//			else if (close.indexOf(sym) != -1) {
//				//if stack is empty (some opening is less)
//				if(s.isEmpty())
//					return false;
//				// pop one from stack
//				char pop = s.pop();
//				// compare if they are matching. if yes, continue.
//				if (close.indexOf(sym) != open.indexOf(pop))
//					// if not matching, return false
//					return false;
//			}
//		}
//		// 4. when whole string is done and if stack is empty, return true else return false
//		if (s.isEmpty())
//			return true;
//		else
//			return false;
//	}

	}

	public static void main(String[] args) {
		String s = "(){}[]";
		System.out.println(isValid(s));

	}

}
