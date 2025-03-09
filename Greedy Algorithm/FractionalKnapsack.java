import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String argc[]){
        int value[] = {60,100,120};
        int weight[] = {10,20,30};
        int capacity = 50;

        double ratio[][] = new double[value.length][2];

        for(int i = 0; i < value.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = (value[i]/(double)weight[i]);
        }
        //Sort the array based on ratio;
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        for(int i = 0; i < value.length;i++){
            for(int j = 0; j < 2; j++){
                System.out.print(ratio[i][j]);
            }
            System.out.println();
        }
        int maxVal =0;
        for(int i = 0; i < value.length; i++){
            if(capacity >= weight[i]){
                maxVal += value[i];
                capacity -= weight[i]; 
            }
            else{
                maxVal += (ratio[i][1] * capacity);
                break;
            }
        }

        System.out.println(maxVal);
    }
}
