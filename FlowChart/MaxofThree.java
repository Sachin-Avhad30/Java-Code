
public class MaxofThree {
    public static void main(String argc[]){
        int a = 10; int b = 5;
        int c = 40;

        if(a > b){
            if(a > c){
                System.out.print(a);
            }
            else{
                System.out.print(c);
            }
        }
        else{
            if(b > c){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }

    }
}
