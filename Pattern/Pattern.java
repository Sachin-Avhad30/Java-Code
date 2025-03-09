/*public class Pattern {
    public static void main(String[] args) {
        for(int j = 0; j < 5; j++){
            for(int i = 1; i <= 5; i++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    
}
output:

1 2 3 4 5 
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5

*/

/*public class Pattern{
    public static void main(String argc[]){
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
Output:

*
**
***
****
*/
/* 
public class Pattern{
    public static void main(String args[]){
        for(int i = 1; i <= 5; i++){
            for(char ch = 'a'; ch <= 'e'; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

Output:

abcde
abcde
abcde
abcde
abcde

*/

/* 
public class Pattern{
    public static void main(String argc[]){

        for(char ch = 'a'; ch <= 'e'; ch++){
            for(int i = 1; i <= 5; i++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

output:

aaaaa
bbbbb
ccccc
ddddd
eeeee
*/
/* 
public class Pattern{
    public static void main(String argc[]){
        for(int j = 1; j <= 5; j++){
            for(int i = 5; i >= 1; i--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

Output:

54321
54321
54321
54321
54321
*/

/* 
public class Pattern{
    public static void main(String argc[]){
        for(int j = 5; j >= 1; j--){
            for(int i = 1; i <= j; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
Output:

*****
****
***
**
*

*/

/* 
public class Pattern{
    public static void main(String argc[]){
        for(char ch ='a'; ch <= 'e'; ch++){
            for(char cha = 'a'; cha <= ch; cha++){
                System.out.print(ch);
            }
            System.out.println();
        }
        
    }
}

Output:

a
bb
ccc
dddd
eeeee
*/

/* 
public class Pattern{
    public static void main(String argc[]){
        for(int j = 1; j <= 5; j++){
            for(int i = j; i >= 1; i--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
Output:

1
21
321
4321
54321
*/

/* 
public class Pattern{
    public static void main(String argc[]){
        for(int j = 1; j <= 5; j++){
            for(int i = 1; i <= j; i++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

Output:

1
12
123
1234
12345
*/
/* 
public class Pattern{
    public static void main(String argc[]){
        for(int j = 5; j >= 1; j--){
            for(int i = 1; i <= j; i++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

Output:

12345
1234
123
12
1

*/

/* 
public class Pattern{
    public static void main(String argc[]){
        for(int j = 5; j >= 1; j--){
            for(int i = 5; i >= j; i--){
                System.out.print(i);
            }
            System.out.println();
        }

    }
}

Output:

5
54
543
5432
54321
*/

/* 
public class Pattern {
    public static void main(String argc[]){
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 5; j++){
                if(j == 1 || j == 5 || i == 1 || i == 4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
             System.out.println();
        }
    }
}

output;

*****
*   *
*   *
*****
*/

/* 
public class Pattern{
    public static void main(String argc[]){
        for(int i = 4; i >= 1; i--){
            for(int j = 1; j <= 4; j++){
                if(j < i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

output

   *
  **
 ***
****
*/

/* 
public class Pattern{
    public static void main(String[] args) {
        for(int j = 5; j >= 1; j--){
            for(int i = 1; i <= j; i++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

output:
12345
1234
123
12
1
*/

/* 
public class Pattern{
    public static void main(String[] args) {
        int num = 1;
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}

output:

1
23
456
78910
1112131415
*/

public class Pattern{
    public static void main(String[] args) {
        int one = 0; int d = 0;
        for(int i = 1; i <=5; i++){
           for(int j = 1; j <= i; j++){
                one++;
                System.out.print(one);
                one--;
            }
           System.out.println();
        }
    }
}

/*public class Pattern{
    public static void main(String[] args) {
        int a = 1;
        for(int i = 1; i <= 2; i++){
           
            System.out.println(a);
            a--;
        }
    }
}*/