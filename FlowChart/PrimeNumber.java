import java.util.*;
public class PrimeNumber {
    public static void main(String argc[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number:");
        n = sc.nextInt();

        if(n == 2){
            System.out.println(n+" is prime..");
        }
        else{
            int div =2;
            if(div < n/2){
                if(n % div == 0){
                    System.out.print(n+" is not prime number..");
                }
                div++;
            }

            System.out.println(n+" is prime..");
        }
    }
}
