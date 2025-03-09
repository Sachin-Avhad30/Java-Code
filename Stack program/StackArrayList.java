import java.util.ArrayList;

public class StackArrayList {
    static class Stack{
        //Creating the ArrayList
        static ArrayList<Integer> list = new ArrayList<>();

        //Stack Empty condition;
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        //Push operation on the stack
        public static void push(int data){
            list.add(data);
        }

        //Pop operation on the stack
        public static int pop(){
            //If stack is empty
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        
        //Peek operation on the stack, peek the top element
        public static int peek(){
            // If stack is empty
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            return top;
        }
    }
    public static void main(String argc[]){
        //Creating the object of the stack;
        Stack s = new Stack();
        //Push operation 
        s.push(1);
        s.push(2);
        s.push(3);
    
        
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
