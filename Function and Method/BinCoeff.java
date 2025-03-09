import java.util.*;
public class BinCoeff {

    public static int factorial(int a){
        int fact = 1;
        for(int i = a; i >= 1; i--){
            fact = fact * i;
        }
        return fact;
    }

    public static void binoCoeff(int n , int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int n_min_r = factorial(n-r);

        int bicoeff = (n_fact / (r_fact * n_min_r));
        System.out.println(bicoeff);
    }
    public static void main(String argc[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        binoCoeff(n,r);
    }
}
