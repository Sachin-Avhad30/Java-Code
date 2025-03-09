
public class Recursion2 {
    public static int tilingProblem(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        //verticle choice;
        int n_1 = tilingProblem(n - 1);
        //Horizontal Choice
        int n_2 = tilingProblem(n - 2);

        return n_1 + n_2;
    }
    public static void main(String argc[]){
        int n = 4;
        System.out.println(tilingProblem(n));
    }
}
