
public class StackLinkList {

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack{
        static Node head = null;

        //Empty Condition
        public static boolean isEmpty(){
            return head == null;
        }

        // push operation 
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                
            }else{
                newNode.next = head;
                head = newNode;
            }
        }

        //Pop operation
        public static int pop(){
            
            if(isEmpty()){
                return -1;
            }
            // if(head.next == null){
            //     head = null;
            // }
            int top = head.data;
            head = head.next;
            return top;
        }

        //Peek operation
        public static int peek(){
            if(head == null){
                return -1;
            }
            return head.data ;
        }
    }

    public static void main(String argc[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
