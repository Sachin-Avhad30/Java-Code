public class StringCompression {
    public static String stringCompression(String str){
        String newString ="";
        
        for(int i = 0; i < str.length(); i++){
            Integer count = 1;
            while(i < str.length() -1 && str.charAt(i) == str.charAt(i + 1)){
                count++;
                i++;
            }
            newString += str.charAt(i);
            if(count > 1){
                newString +=count.toString();
            }

        }
        return newString;
    }

    public static StringBuilder stringCompression1(String str){
        StringBuilder sb = new StringBuilder("");
        Integer count = 0;
        for(int i = 0; i < str.length(); i++){
            count = 1;
            while(i < str.length() -1 && str.charAt(i)== str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count.toString());
            }
        }
        return sb;
    }
    public static void main(String argc[]){
        String str = "aaabbcccdd";
        //String ret =stringCompression(str);
        StringBuilder ret = stringCompression1(str);
        System.out.println(ret);
    }
}
