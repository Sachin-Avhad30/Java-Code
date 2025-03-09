import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int arr[],int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String argc[]){
        int arr[] = new int[8];
        Scanner sc = new Scanner(System.in);

        //input the array from the user
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element which we want to search:");
        int key = sc.nextInt();

        int result = linearSearch(arr,key);
        //System.out.println("The Elemnt is present at index:"+result);

        if(result == -1){
            System.out.println("Elemnt is not found in the array");
        }
        else{
            System.out.println("Element is found at index:"+result);        }

    }
}
