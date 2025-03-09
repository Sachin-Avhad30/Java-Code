public class LinkList {

    class Node{
        public int data;
        public Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    public static Node tail = null;

    // Insertion at the begining of linklist
    public void insertFirst(int data){

        // if linkedlist is empty
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }

        // If linklist is exist;
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    // Insertion at Last
    public void insertLast(int data){
        Node newNode = new Node(data);
        //If linked list is empyt
        if(head == null){
            head = tail = newNode;
        }
        //If linkedlist is exist
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    //Insertion at given position
    public void insertMiddle(int data,int idx){
        Node newNode = new Node(data);
        if(idx == 0){
            insertFirst(data);
            return;
        }
        int count = 0;
        Node temp = head;
        while(count < (idx - 1)){
            temp = temp.next;
            count++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //Printing the link list
    public void printLinklist(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    //Creating linklist using recursion insert at the end

    public Node createRecursion_end(int arr[],int idx,int size){
        //Base case 
        if(idx == size){
            return null;
        }
        Node newNode = new Node(arr[idx]);
        newNode.next = createRecursion_end(arr, idx+1, size);
        return newNode;

    }


    //Deletion in the linked list at the first
    public void deleteFirst(){
        if(head == null){
            System.out.println("Link list is empty..");
            return;
        }
        head = head.next;
    }


    //Delaetion at the last
    public void deleteLast(){
        if(head == null){
            System.out.println("Link list is empty");
        }
        Node temp = head;
        Node prev = null;
        while(temp.next != null){
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        tail = prev;
    }

    public static void main(String argc[]){

        LinkList l1 = new LinkList();
        l1.insertFirst(45);
        l1.printLinklist();
        l1.insertFirst(46);
        l1.insertFirst(34);
        l1.insertFirst(78);

        l1.printLinklist();


        l1.insertLast(49);
        l1.insertLast(23);
        l1.insertLast(14);
        l1.insertLast(99);

        l1.printLinklist();

        l1.insertMiddle(55, 2);
        l1.printLinklist();

        l1.deleteFirst();
        l1.printLinklist();

        l1.deleteLast();
        l1.printLinklist();


        // int arr[] = {4,5,6,9,10};
        // head = l1.createRecursion_end(arr, 0, 5);
        // l1.printLinklist();
    }
}