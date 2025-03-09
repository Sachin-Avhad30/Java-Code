import java.util.*;
public class MaxSumInArray {

    // Brust solution time Complexity is O(n^3)
    public static void maxSum(int arr[]){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                sum = 0;
                for(int k = i; k <= j; k++){
                    sum = sum + arr[k];
                }
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
        }
        System.out.println("Maximum sum in the array is : "+maxSum);
    }

    // Second Solutio for maximum sum in the array time complexity is O(n^2)
    public static void maxSum1(int arr[]){
        int prefixArr[] = new int[arr.length];
        
        prefixArr[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
           prefixArr[i] = prefixArr[i-1] + arr[i];
        }
        /*for(int i = 0; i < arr.length; i++){
            System.out.print(prefixArr[i]+" ");
        }*/
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                currSum = i==0 ? prefixArr[j] : prefixArr[j] - prefixArr[i-1];
            }
            if(currSum > maxSum){
                maxSum = currSum;
            }
        }
        System.out.println("Maxximum Sum in array is :"+maxSum);
    }

    //kadans Algorithm

    public static void kadanes(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0; i < arr.length; i++){
            currSum += arr[i];
            if(currSum < 0){
                currSum = 0;
            }
            else{
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.print("Max Sum is : "+ maxSum);
    }

    public static int maxSubArray(int[] arr) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(sum < 0){
                sum = 0;
            }
            else{
                if(sum > maxSum){
                    maxSum = sum;
                }
            }  
        }
        
        if(maxSum < 0){
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < arr.length;i++){
                if(arr[i]>max){
                    max = arr[i];
                }
            }
            return max;
        }
        else{
            return maxSum;
        }
    }
    public static void main(String argc[]){
        int num[] = {2,1,3,4};
        int num1[] = {-1,5,6,-9,9,-6,-10};
        //maxSum(num);
        //maxSum1(num);
        //kadanes(num1);
        int arr1[] ={-2,-1};
        System.out.println(maxSubArray(arr1));
    }
}
