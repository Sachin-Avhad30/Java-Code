import java.util.*;
public class accenture {

    public static void sachin(int arr[]){
        int smallSum = 0;
        int largeSum = 0;
        for(int i = 0; i < arr.length; i++){
            int m = arr[i];
            smallSum = 0;
            largeSum = 0;

            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < m){
                    smallSum = smallSum + arr[j];
                }
                else{
                    largeSum = largeSum + arr[j];
                }
            }
            System.out.println(smallSum*largeSum+ " ");
        }

        
    }
    public static void main(String argc[]){
        Scanner sc = new Scanner(System.in);

        int []arr = {8,4,5,3,2,6,9,1};
        int n = 8;

        sachin(arr);
    }
}
