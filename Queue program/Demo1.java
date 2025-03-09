//Queue implementation using array
public class Demo1 {

    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        public Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        public static boolean isFull(){
            return rear == (size -1);
        }

        public void add(int data){
            if(isFull()){
                System.out.println("Queue is Full");
            }
            else{
                rear = rear + 1;
                arr[rear] = data;
            }
        }


        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = arr[0];
            for(int i = 0; i < rear; i++){
                arr[i] = arr[i+1];
            }
            rear = rear -1;
            return front;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
            }
            return arr[0];
        }
    }

    public static void main(String argc[]){
        Queue q = new Queue(6);
        q.add(1);
        q.add(2);
        q.add(3);
        // q.add(4);
        // q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
           
            q.remove();
        }
    }
}
