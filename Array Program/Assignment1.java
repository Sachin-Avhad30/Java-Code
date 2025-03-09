public class Assignment1 {
    public static boolean isDuplicate(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String argc[]){
        int num[] = {1,1,1,3,3,4,3,2,4,2};
        boolean ret = isDuplicate(num);
        System.out.print(ret);
    }
    
}
