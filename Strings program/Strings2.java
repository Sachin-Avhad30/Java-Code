import java.util.Scanner;

public class Strings2 {
    public static void main(String argc[]){
        //how to input the string from user

        //by making the object of Scanner class
         Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter the string");
        String str = sc.next();
        System.out.println(str);*/

        // if we have to take input of the sentence
        // then next() function is not work 
        // because it does not take input after the space

        // new nextLine() function is used to solve that problem
        System.out.println("Enter the sentence");
        String str2;
        str2 = sc.nextLine();
        System.out.println(str2);


    }
}
