

public class ReverseArray {
    public static void reverseArray(int arr[]){
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("Reversal of the array");
        for(int k = 0; k < arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }

    public static void reverseArray1(int arr[]){
        int brr[] = new int[arr.length];
        int j = 0;
        int i = arr.length -1;
        while(i > -1){
            brr[j] = arr[i];
            j++;
            i--;
        }

        for(j = 0; j < brr.length; j++){
            System.out.print(brr[j]+" ");
        }
    }
    public static void main(String argc[]){
        int arr[] = {22,54,68,89,78,122};
        //reverseArray(arr);
        System.out.println();
        reverseArray1(arr);
    }
}
