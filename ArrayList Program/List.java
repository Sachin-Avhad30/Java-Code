import java.util.ArrayList;

public class List {
    public static void main(String argc[]){
        //Creating the array list 
        //Syntax
        ArrayList<Integer> list = new ArrayList<>();

        //Add operation on the array list
        //Time complexity O(1);
        list.add(1);
        list.add(10);
        list.add(45);
        list.add(52);
        list.add(23);
        System.out.println(list);

        //Accesing the element in the array
        //Time Complexity O(1);
        System.out.println(list.get(1));

        //Removing the element from the arraylist
        //Time complexity O(n);
        list.remove(1);
        System.out.println(list);

        //Set the value on the particular index
        //Time Complexity O(n);
        list.set(1,85);
        System.out.println(list.size());
        list.set(3,99);
        System.out.println(list);

        //Contain a element in the particular list or not
        //Time complexity O(n);
        boolean b = list.contains(45);
        System.out.println(b);


        //Size of the array list  size()function

        int a = list.size();
        System.out.println(a);


        //printting the arraylist

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        
    }
}
