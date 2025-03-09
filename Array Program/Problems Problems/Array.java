import java.util.*;

public class Array {
    // Max Element in the array

    public static void maxElement(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum Element in the array is:"+ max);
    }

    //Minimum Element in the array

    public static void minElement(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum Element in the array is :"+min);
    }


    //Linear Search on the array

    public static int linearSearch(int arr[],int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    //Reverse the array 

    public static void revereArray(int arr[]){
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println();
        for(i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }

    // Binary search

    public static int binarySearch(int arr[],int key){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid  = (start + end) / 2;

            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] > key){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }


    //print pair
    public static void printPair(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                System.out.print("("+arr[i]+","+arr[j]+")"+ " ");
            }
        }
    }

    //print Sub array

    public static void printSubArray(int arr[]){
        
        for(int i = 0; i < arr.length; i++){
            int start = i;
            for(int j = i; j <arr.length; j++){
                int end = j;
                System.out.print("[");
                for(int k = start; k <= end; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.print("]");
                System.out.println();
            }
            System.out.println();
        }
    }

    //peak index in mountain array

    public static int peakIndex(int arr[]){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = (start + end) / 2;

            if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]){
                return mid;
            }
            else if(arr[mid] > arr[mid -1]){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }


    //Selection sort

    public static void selectionSort(int arr[]){
        for(int i = 0; i < arr.length -1; i++){
            int index = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[index]){
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String argc[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        //input the array
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // 1) Max value
        //maxElement(arr);

        // 2) Min value
        //minElement(arr);

        // 3) Linear Search
        //System.out.println(linearSearch(arr, 5));

        // 4)Reverse the array
        //revereArray(arr);

        // 5) Binary Search
        //System.out.print(binarySearch(arr,8));

        // 6) Print the all possible pair in the arry
        //printPair(arr);

        // 7) Print Sub array
        //printSubArray(arr);

        // 8) Peak index in mountain array
        // System.out.println(peakIndex(arr));

        // 9) Selection sort
        selectionSort(arr);
    }
}
