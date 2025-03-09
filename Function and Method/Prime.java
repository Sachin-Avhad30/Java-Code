import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }
        else{
            for(int i = 2; i <= n/2;i++){
                if(n % i == 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void printPrime(int n){
        for(int i = 2; i <= n; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String argc[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //boolean res = isPrime(n);
        //System.out.println(res);
        printPrime(n);
    }
}
