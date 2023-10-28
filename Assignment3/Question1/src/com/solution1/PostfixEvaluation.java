package com.solution1;

public class PostfixEvaluation {
	public static int calculate(int op1, char opr, int op2) {
		switch (opr) {
		case '+':
			return op1 + op2;
		case '-':
			return op1 - op2;
		case '*':
			return op1 * op2;
		case '/':
			return op1 / op2;
		case '%':
			return op1 % op2;
		}
		return 0;
	}

	public static int postfixEvaluate(String postfix) {
		Stack st = new Stack(10);
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < postfix.length(); i++) {

			char ele = postfix.charAt(i);
			// if (postfix.charAt(i) != ' ') {
			if (Character.isDigit(ele)) {
				str.append(ele);
				// System.out.println(str);
			}
			// }
			else if (ele == ' ') {
				String s = str.toString();
				int num = Integer.parseInt(s);
				System.out.println(num);
				st.push(num);
				str.delete(0, str.length());
			} 
			else {
				int op2 = st.pop();
				int op1 = st.pop();
				int res = calculate(op1, ele, op2);
				st.push(res);
			}
		}

		// st.push(ele-'0');

		if (!st.isEmpty())
			return st.pop();
		return 0;

	}

	public static void main(String[] args) {
		String str = "22 23 +24 +";

		int res = postfixEvaluate(str);
		System.out.println(res);
	}
}
