import java.util.*;

public class SmallestElement {
    public static int smallestElement(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String args[]){

        int arr[] = {7,96,5,56,1,47,41};

        int min = smallestElement(arr);
        System.out.println("Minimum Element in the array:"+ min);

    }
}
