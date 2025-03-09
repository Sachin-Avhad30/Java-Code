import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

public class ReverseList {
    //Reverse of the Array list
    public static void reverseList(ArrayList<Integer> l1){
        for(int i = l1.size()-1; i >= 0; i--){
            System.out.print(l1.get(i)+" ");
        }
        System.out.println();
    }

    //Maximum in the arrayList
    public static void maxElement(ArrayList<Integer> l1){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < l1.size(); i++){
            if(l1.get(i) > max){
                max = l1.get(i);
            }
        }
        System.out.println("Max element in the list:"+max);
    }


    //Swapping of two element in the list
    public static void swap(ArrayList<Integer> l,int idx1,int idx2){
        int temp =l.get(idx1);
        l.set(idx1, l.get(idx2));
        l.set(idx2, temp);
        System.out.println(l);
    }

    //Sorting the arraylist in descending order
    public static void sort(ArrayList<Integer> l){
        Collections.sort(l);
        System.out.println(l);

    }

    //Sorting ascending order
    public static void sort1(ArrayList<Integer> list){
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
    public static void main(String argc[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
   
        //Reverse the list
        reverseList(list);

        //Maximum in the list
        maxElement(list);

        //swap element on the two indexes in the list
        swap(list,2,3);

        //Sorting of the list
        sort(list);
        sort1(list);
    }
}
