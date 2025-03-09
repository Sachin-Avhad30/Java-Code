import java.util.Scanner;

public class Substring {
    public static String printSubstring(String str,int si,int ei){
        String subString = "";
        for(int i = si; i < ei; i++){
            subString += str.charAt(i);
        }
        return subString;
    }
    public static void main(String argc[]){
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        int startIndex;
        int endIndex;
        System.out.print("Enter the starting indx and ending index:");
        startIndex = sc.nextInt();
        endIndex = sc.nextInt();
        String ret = printSubstring(str,startIndex,endIndex);
        System.out.println(ret);
    }
}
