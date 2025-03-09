import java.util.*;
public class BitManupulation {
    //Get ith bit
    public static void getBit(int n,int pos){
        int bitMask = 1 << pos;
        if((bitMask & n) == 0 ){
            System.out.println("The bit is Zero.");
        }else{
            System.out.println("The bit is 1.");
        }
    }

    //Set ith bit
    public static int setBit(int n, int pos){
        int bitMask = 1 << pos;
        int newNumber = bitMask | n;
        //System.out.println(newNumber);
        return newNumber;
    }

    //Clear ith bit 
    public static int clearBit(int n, int pos){
        int bitMask = 1 << pos;
        int newBitmask = ~(bitMask);
        int newNumber = newBitmask & n;
        //System.out.println(newNumber);
        return newNumber;
    }

    //Update the bit

    public static void updateBit(int n, int pos, int op){
        
        int newNumber =0;
        // if(op == 1){
        //      newNumber = setBit(n, pos);
        // }else{
        //     newNumber = clearBit(n, pos);
        // }
        // System.out.print(newNumber);
        int m = clearBit(n, pos);
        int bitMask = op << pos;
        System.out.println(n | bitMask);



    }

    public static void clearRangeofBit(int num,int i, int j){
        int a = ~(0)<<j + 1;
        int b = (1 << i) - 1;

        int bitmask = a | b;

        int ans = num & bitmask;
        System.out.println(ans);
    }
    public static void main(String argc[]){
        //getBit(5,1);

        
        // setBit(5,2);

        //clearBit(5, 2);

        // updateBit(10,2,1);
   

        clearRangeofBit(2515,2,7);
    }
}
