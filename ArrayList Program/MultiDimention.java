import java.util.ArrayList;

public class MultiDimention {
    public static void main(String argc[]){
        //Syntax for multidimention Arraylist
        ArrayList<ArrayList<Integer>> multilist = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        //Adding the element in the list 1;
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        //Adding the l1 in to the multilist;
        multilist.add(l1);

        //List 2;
        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);
        //Adding list 2 into the multilist
        multilist.add(l2);

        //Printing the multilist
        System.out.println(multilist);
        for(int i = 0 ; i < multilist.size(); i++){
            ArrayList<Integer> currList = multilist.get(i);
            for(int j = 0; j < currList.size(); j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }



        

    }
}
