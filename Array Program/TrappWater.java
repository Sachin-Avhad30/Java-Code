import java.util.*;
public class TrappWater {

    public static void trapWater(int bar[]){
        int left[] = new int[bar.length];
        int right[] = new int[bar.length];
        // calculater the leftmost maximum boundray
        left[0] = bar[0];
        for(int i = 1; i < bar.length; i++){
            left[i] = Math.max(left[i-1], bar[i]);
        }
        /*for(int i = 0; i < left.length; i++){
            System.out.print(left[i]+" ");
        }*/

        //Calculate the right most max boundry
        
        right[bar.length -1] = bar[bar.length -1];
        for(int i = bar.length - 2; i >= 0; i--){
            right[i] = Math.max(right[i+1], bar[i]);
        }
        for(int i = 0; i < left.length; i++){
            System.out.print(right[i]+" ");
        }
        int trapWater = 0;
        for(int i = 0; i < bar.length; i++){
            int waterLevel = Math.min(left[i], right[i]);
            trapWater += waterLevel - bar[i];
        }

        System.out.print("Trap Water in bar is :"+trapWater);
    }

    public static void main(String atgc[]){
        int bar[] = {4,2,0,6,3,2,5};
        trapWater(bar);

    }
    
}
