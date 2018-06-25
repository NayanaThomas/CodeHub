package codeing;
 class ParenthesisMatching {
	public class Stack {
      		int top=-1;
           	char[] s = new char[100];
        	
      void push(char x) {
      		if(top==99) {
      			System.out.println("Stack overflow");
            }
            else {
			s[++top] = x;
            }
      }

      char pop() {
		if(top == -1) {
			System.out.println("Stack underflow");
			return '\0'; 
		}
		else {
			char c = s[top];
			top--;
			return c;
		}
      }

      boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		else {
			return false;
		}
      }
	}
	
	boolean isMatching(char cur, char popped) {
		if(cur=='}' && popped == '{') {
			return true;
		}
		if(popped == '[' && cur == ']') {
			return true;
		}
		if(popped=='(' && cur == ')') {
			return true;
		}
		return false;
	}

	boolean isBalanced(char[] exp) {
		Stack st = new Stack();
		for(char c: exp){
			if(c == '{' || c=='[' || c=='(') {
				st.push(c);
			}
			else if(c == '}' || c==']' || c==')') {
				if(st.isEmpty()) {
					return false;
				}
				char popped = st.pop();
				if(!isMatching(c, popped)) {
					return false;
				}
			}
		}
		if(st.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}

	
	public static void main(String[] args) {
		char[] exp = {'[','(',')', ']', '{', '}','{', '[',')', ']', '(', ')', '}'};
		ParenthesisMatching p = new ParenthesisMatching();
		if(p.isBalanced(exp)) {
			System.out.println("Balanced");
		}
		else {
			System.out.println("Not balanced");
		}
	}
}
		
