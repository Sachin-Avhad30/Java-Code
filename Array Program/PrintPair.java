
public class PrintPair {
    public static void printPair(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j <arr.length; j++){
                System.out.print("("+ arr[i]+ "," + arr[j] +")"+",");
            }
            System.out.println();
        }
    }
   public static void main(String argc[]) {
        int arr[] = {4,8,9,6,3,55,44};
        printPair(arr);
   }
}
