import java.util.*;
public class Addition {
    //Method to add the two number

    // retun type is int because it return integer value
    public static int add(int a,int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String argc[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int addition = add(a,b);
        System.out.println(addition);
    }
}
