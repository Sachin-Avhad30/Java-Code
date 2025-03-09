import java.util.Scanner;

public class Pattern1 {
    public static void solid_roumbus(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n - i);j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_Rectangle(int row,int column){
        for(int i = 1; i <= row;i++){
            for(int j = 1; j <= column; j++){
                if(i == 1 || i == row || j == 1 || j == column){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void hollow_roumbus(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= n; k++){
                if(i == 1 || i == n || k == 1 || k == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_Tringle(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }
            for(int l = 1; l <= i; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void inverted_NumberTringle(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n - i); j++){
                System.out.print(" ");
            }
            for(int l = i; l >= 1; l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }

    public static void diamondPattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <=(n-i); j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
         for(int i = n; i >= 1; i--){
            for(int j = 1; j <=(n-i); j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void butterflyPattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int l = 1; l <= 2*(n-i); l++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int l = 1; l <= 2*(n-i); l++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String argc[]){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        //int column = sc.nextInt();
        //solid_roumbus(n);
        //hollow_Rectangle(row,column);
        //hollow_roumbus(row);
        //inverted_Tringle(row);
        //inverted_NumberTringle(row);
        //numberIncrementedTringle(row);
        //diamondPattern(row);
        butterflyPattern(row);

        
    }
}
