import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int arr[],int key){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if (key > arr[mid]){
                start = mid + 1;
            }
            else{
                end = end - 1;
            }
        }
        return -1;
    }
    public static void main(String argc[]){
        int arr[] = {11,18,25,30,45,50,64,66,70};
        int key = 64;

        int result = binarySearch(arr,key);
        if(result == -1){
            System.out.println("Element is not found");
        }
        else{
            System.out.println("Element is found at: "+result+"th index");
        }
    }
}
