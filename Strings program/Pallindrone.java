import java.util.Scanner;

public class Pallindrone {

    public static boolean isPallindrone(String str){
        int i = 0;
        int j = str.length() - 1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String argc[]){
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        str = sc.next();

        boolean result = isPallindrone(str);
        if(result == true){
            System.out.println("String is Pallindrone");
        }
        else{
            System.out.println("String is not pallindroen");
        }
    }
}
