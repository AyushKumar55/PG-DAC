import java.util.Stack;

public class PostfixEvaluation {

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
	
	public static int postfix(String postfix) {
		Stack<Integer> s = new Stack<>();
		for(int i = 0; i < postfix.length(); i++) {
			char sym = postfix.charAt(i);
			if(Character.isDigit(sym)) {
				String operand = Character.toString(sym);
				s.push(Integer.parseInt(operand));
			}
			else {
				int b = s.pop();
				int a = s.pop();
				int c = calc(a, b, sym);
				s.push(c);
			}
		}
		return s.pop();
	}
	
	public static void main(String[] args) {
		String postfix = "59+4862/-*-173-$+";
		int result = postfix(postfix);
		System.out.println("Result = "+result);
	}
}
