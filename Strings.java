import java.util.*;

public class Strings {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();
            reverseStringWithNumbers(inputString);
        }
    
        public static void reverseStringWithNumbers(String inputString) {
            String[] words = inputString.split("\\s+");

            for(int i = 0; i <words.length; i++){
                System.out.println(words[i]+" ");
            }

            StringBuilder sb = new StringBuilder();
            // for(int i = words.length -1; i >= 0; i--){
            //     if(words[i].matches("[0-9]"+" ")){
            //         sb.append(words[i]);
            //         break;
            //     }
            //     else
            //     {
            //         sb.append(words[i]+" ");
            //     }
                
            // }
            for(int i = 0; i < words.length;i++){
            int j = (words.length-1);
            while(!(words[i]).matches("[0-9]")) {
                sb.append(words[i]+" ");
                j--;
            }
            String sns = sb.toString();
            System.out.println(sns);
        }
    }