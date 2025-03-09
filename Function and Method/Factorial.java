import java.util.*;
public class Factorial {

    public static int factorial(int a){
        int fact = 1;
        for(int i = a; i >= 1; i--){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String argc[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = factorial(n);
        System.out.println(factorial);
    }
}
