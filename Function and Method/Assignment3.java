import java.util.Scanner;

public class Assignment3 {
    public static boolean pallindrone(int a){
        int temp = a;
        int rev = 0;
        while(a > 0){
            int last = a % 10;
            rev = rev * 10 + last;
            a = a / 10;
        }
        a = temp;
        if(a == rev){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String argc[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean res = pallindrone(a);
        System.out.println(res);
    }
    
}
