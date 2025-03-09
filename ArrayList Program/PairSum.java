import java.util.ArrayList;

public class PairSum {

    //Pair Sum brust approch

    public static boolean pairSum(ArrayList<Integer> list, int target){
        for(int i = 0; i < list.size(); i++){
            for(int j = i + 1; j < list.size(); j++){
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }

    //two pointer approch
    public static boolean pairSum1(ArrayList<Integer> list, int target){
        int leftPointer = 0;
        int rightPointer = list.size() -1;
        while(leftPointer < rightPointer){
            if(list.get(leftPointer) + list.get(rightPointer) == target){
                return true;
            }

            //if sum less the target sum , increse left pointer
            if(list.get(leftPointer) + list.get(rightPointer) < target){
                leftPointer++;
            }
            else{
                rightPointer--;
            }
        }
        return false;
    }
    public static void main(String argc[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int target = 5;
        
        System.out.println(pairSum(list, target));
        System.out.println(pairSum1(list, target));

    }
}
