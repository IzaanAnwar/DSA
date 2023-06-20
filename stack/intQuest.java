import java.lang.*;
import java.util.Stack;

class IntQuest {
    public static void main(String[] args) {
        String str = "{{{}";
        int ans = findMinimumCost(str);
        System.out.println(ans);
    }
    
    private static void del(Stack<Integer> s,int mid) {
        //base case
        if(s.size() == mid) {
            s.pop();
            return;
        }
        
        int top = s.peek();
        s.pop();
        del(s,mid);
        s.push(top);
        
    }
    public static void deleteMid(Stack<Integer> stack){
        int mid = stack.size() / 2;
        System.out.println(mid);
        del(stack, mid);
        
    }
    private static boolean matches(char exp, char top) {
        if (exp == '(' && top == ')') return true;
        else if(exp == '{' && top == '}') return true;
        else if (exp == '[' && top == ']') return true;
        else return false;
    } 

    public static boolean isValid(String str) {
        Stack<Character> st = new Stack<>();

        for(int i=0;i<str.length();i++) {
            char exp = str.charAt(i);
            System.out.println(exp);
            if(exp == '(' || exp == '[' || exp == '{') {
                st.push(exp);
            } else {
                if(!st.isEmpty()) {
                    System.out.println("not empty");
                    char top = st.peek();
                    System.out.println("exp =>"+exp + " " + "top =>"+ top);
                    if( matches(top,exp)){
                        System.out.println("matches");
                        st.pop();
                    } else return false;
                } else return false;
            } 
            
        }
        if(st.isEmpty()) return true;
        else return false;

    }


  public static void pushAtBottom(Stack <Integer> myStack, int x) {
    // base case
    if (myStack.isEmpty()) {
      myStack.push(x);
      return;
    }

    int top= myStack.peek();
    myStack.pop();
    pushAtBottom(myStack, x);
    myStack.push(top);
  }


  public static void reverseStack(Stack<Integer> stack) {
		// write your code here
		if(stack.isEmpty())return;

		int top = stack.peek();
		stack.pop();
		reverseStack(stack);
		pushAtBottom(stack, top);
		
	}


  	private static void sortedInsert(Stack <Integer> myStack, int x) {
    // base case
    if (myStack.isEmpty() || myStack.peek() < x) {
      myStack.push(x);
      return;
    }

    int top= myStack.peek();
    myStack.pop();
    sortedInsert(myStack, x);
    myStack.push(top);
  }

	public static void sortStack(Stack<Integer> stack) {
		// base case
		if(stack.isEmpty()) return;

		int top = stack.peek();
		stack.pop();

		sortStack(stack);
		sortedInsert(stack, top);


	}




    private static boolean isAnOp(char ch) {
        if (ch == '*' || ch == '-' || ch == '+' || ch == '/') return true;
        return false;
    }
    public static boolean findRedundantBrackets(String s) 
    {
        // Write your code here.
        Stack< Character > st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || isAnOp(ch)) {
                st.push(ch);
            } else {
                if(ch == ')') {
                    boolean isRedundant = true;
                    while (st.peek() != '(') {
                        char elAtTop = st.peek();
                        st.pop();
                        if(isAnOp(elAtTop)){
                            isRedundant = false;
                        }

                    }

                    if(isRedundant == true) {
                        return true;
                    }
                    st.pop();


                }
            }
            
        }
        return false;
    }



    public static int findMinimumCost(String str) {

    if(str.length() == 0 || str.length() ==1) return 0;
    Stack< Character > st = new Stack<>();
      for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (ch == '{') {
          st.push(ch);
        } else {
          if(ch == '}') {
            if(!st.isEmpty()) st.pop();
          }
        }

      }
      if(st.isEmpty()) return 0;
      return st.size();
    }

}
