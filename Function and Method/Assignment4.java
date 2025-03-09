import java.util.Scanner;
    
public class Assignment4 {

    public static int digitSum(int n){
        int sum = 0;
        while(n > 0){
            int last = n % 10;
            sum = sum + last;
            n = n / 10;
        }
        return sum;
    }
    public static void main(String argc[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int digitSum = digitSum(a); 
        System.out.println(digitSum);

    }
}
