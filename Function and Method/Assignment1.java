import java.util.*;
public class Assignment1 {

    public static float averageThree(int a,int b,int c){
        int sum = a + b + c;
        float avg = (float)sum / 3;
        return avg;
    }

    public static void main(String argc[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float avg = averageThree(a,b,c);
        System.out.println("Average is : "+avg);
    }
    
}
