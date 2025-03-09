import java.util.*;
public class Swap {

    //call by value
    //in this function at the time of function defination a,b is the formal parameter
    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }

    public static void main(String argc[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //at the time of function call here a ,b is argument / actual parameter
        swap(a, b);
    }
    
}
