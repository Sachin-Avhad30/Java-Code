import java.util.*;
public class BinToDecimal {
    public static int power(int num,int pow){
        int power = 1;
        for(int i = 1; i <= pow; i++){
            power = power * num;
        }
        return power;
    }
    public static void binTodecimal(int n){
        int decimal = 0;
        int pow = 0;
        while(n > 0){
            int last = n % 10;
            int power = power(2,pow);
            decimal = decimal + last * power;
            n = n / 10;
            pow++;
        }
        System.out.println(decimal);
    }
    public static void main(String argc[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        binTodecimal(n);
    }
}
