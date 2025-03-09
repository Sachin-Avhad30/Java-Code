import java.util.*;
public class Assignment2 {
    public static boolean isEven(int a){
        if(a % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String argc[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a == 0){
            System.out.println("The number is zero");
        }
        else if(isEven(a)){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
        if(isEven(12)){
            System.out.println("The Function is working fine");
        }
        else{
            System.out.println("There is some error function");
        }
        
    }
    
}
