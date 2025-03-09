import java.util.*;
public class LargestElement {
    public static int largestElement(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String argc[]){
        int arr[] = {7,8,6,1,2,89};
        int max = largestElement(arr);
        System.out.println("Max Element in the array:"+max);
    }
}
