import java.util.Scanner;

public class Array1 {

    public static void updateMark(int arr[]){
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] + 1;
        }
    }
    public static void main(String argc[]){
        //declaration of the array
        int arr[] = new int[10];

        //declaration of array plus initialization

        int arr1[] = {1,2,3};


        String fruit[] = {"apple","mango","banana"};


        //passing the array to the function

        int mark[] = new int[5];
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < mark.length; i++){
            mark[i] = sc.nextInt();
        }
        //array before the updation
        for(int i = 0; i < mark.length; i++){
            System.out.print(mark[i]+" ");
        }

        updateMark(mark);
        System.out.println();

        //array after the updation
        for(int i = 0; i < mark.length; i++){
            System.out.print(mark[i]+" ");
        }

    }
}
