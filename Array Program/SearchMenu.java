import java.util.Scanner;

public class SearchMenu {
    public static boolean stringLinearsearch(String arr[],String menu){
        String s = new String();
        s = menu;
        for(int i = 0; i < arr.length; i++){
            if(s.equals(arr[i])){
                return true;
            }
        }
        return false;
    }
    public static void main(String argc[]){
        String arr[] = {"Samosa","Vada-Pav","Pav-vada","Paratha","Misal"};

        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Which nasta you want:");
        s = sc.nextLine();
        boolean res = stringLinearsearch(arr,s);
        if(res == true){
            System.out.println(s+" is available in hotel");
        }
        else{
            System.out.println(s+" not available");
        }
    }
}
