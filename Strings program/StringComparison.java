public class StringComparison {
    public static void main(String argc[]){
        String str1 = "sachin";
        String str2 = "sachin";
        
        String str3 = new String("sachin");
        String str4 = "avhad";

        if(str1 == str2){
            System.out.println("String are equal");
        }else{
            System.out.println("String are not equal");
        }

        if(str1 == str3){
            System.out.println("String are equal");
        }else{
            System.out.println("String are not equal");
        }

        // for comparing the value we use the equals method;

        if(str1.equals(str3)){
            System.out.println("String are equal");
        }else{
            System.out.println("String are not equal");
        }

    }
}
