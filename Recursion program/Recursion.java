
public class Recursion {

    //Fibonacci Number 
    public static int fibonacciNo(int n){
        if(n==0)return 0;
        if(n == 1) return 1;
        int fib = fibonacciNo(n-1) + fibonacciNo(n -2);
        return fib;
    }

    // Is the array is sorted or not 

    public static boolean isSorted(int arr[],int i){
        
        if(i == arr.length -1){
            return true;
        }
        if(arr[i] >= arr[i+1]){
            return false;
        }
        else{
           return isSorted(arr, i+1);
        } 
    }

    //First Occurance

    public static int firstOccurance(int arr[],int key,int i){
        if(arr[i] == key){
            return i;
        }
        else{
            return firstOccurance(arr, key, i+1);
        }
        
    }

    //Lasr Accurance
    public static int lasrOccurance(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return lasrOccurance(arr, key, i-1);
        
    }
    public static void main(String argc[]){
        int n = 5;
        
        //System.out.println(fibonacciNo(n));

        // int arr[] = {1,2,3,4,5,6};
        // boolean ret = isSorted(arr, 0);
        // System.out.println(ret);

        int arr[] = {8,3,6,9,5,10,2,5,3};
        //System.out.println(firstOccurance(arr, 5, 0));
        int m = arr.length -1 ;
        System.out.println(firstOccurance(arr, 5, m-1));
    }
}
