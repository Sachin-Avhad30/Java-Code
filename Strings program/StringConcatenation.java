import java.util.Scanner;

public class StringConcatenation {
    public static String concateString(String s1,String s2,String s3){
        String fullName ="";
        fullName = s1 + " " + s2 + " " + s3;
        return fullName;

    }
    //Length of the string
    public static int stringLength(String str){
        int length = str.length();
        return length;
    }


    //charecter at given index in the string 
    public static char charAt(String str,int index){
        char ch = str.charAt(index);

        return ch;
    }
    public static void main(String argc[]){
       String firstName;
       String middleName;
       String lastName; 
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the first name");
       firstName = sc.next();
       System.out.println("Enter the middle name");
       middleName = sc.next();
       System.out.println("Enter the last name");
       lastName = sc.next();

        //Concatenation of the string

       String ret = concateString(firstName,middleName,lastName);
       System.out.println(ret);

       //String length
       System.out.println(stringLength(firstName));


       //charecter at the index in the string 
       System.out.println(charAt(middleName,2));
    }
}
