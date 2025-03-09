import java.util.Scanner;

public class DecimalToBinary {
    public static int power(int num,int pow){
        int power = 1;
        for(int i = 1; i <= pow; i++){
            power = power * num;
        }
        return power;
    }
    public static void decimalTobinary(int n){
        int pow = 0;
        int binary = 0;
        while(n > 0){
            int rem = n % 2;
            int power = power(10,pow);
            binary = binary + rem * power ;
           
            pow++;
            n = n / 2;
        }
        System.out.println(binary);
    }
    public static void main(String argc[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        decimalTobinary(n);
    }
}
