public class SubArraySum {

    public static void subArraysum(int arr[]){
        int sum;
        for(int i = 0; i < arr.length;i++){
            
            for(int j = i; j < arr.length; j++){
                sum = 0;
                System.out.print("[");
                for(int k = i; k <= j; k++){
                    sum = sum + arr[k];
                    System.out.print(arr[k]+" ");
                    
                }
                System.out.print("]");
                System.out.print(" = "+sum);
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String argc[]){
        int num[] = {2,4,6,8,10,12,14,16};
        subArraysum(num);
    }
}
