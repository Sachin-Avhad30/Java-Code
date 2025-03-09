import java.util.Stack;

public class ReverseStack {
    //Reversing the stack using another stack
    public static void reverseStack1(Stack<Integer> s){
        Stack<Integer> ans = new Stack<>();
        while (!s.isEmpty()) {
            int top = s.pop();
            ans.push(top);
        }
        while(!ans.isEmpty()){
            System.out.println(ans.peek());
            ans.pop();
        }
    }

    //Push at Bottom required
    public static void pushBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBottom(s, data);
        s.push(top);
    }
    //Reverse the stack using the recursion
    public static void reverseStack2(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack2(s);
        pushBottom(s,top);
    }
    //Print the stack
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
       //reverseStack1(s);
       reverseStack2(s);
       printStack(s);
    }
}
