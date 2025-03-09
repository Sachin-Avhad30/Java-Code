import java.util.ArrayList;

public class ArrayList1 {
    //Brust Approch
    public static int storeWater(ArrayList<Integer> list){
        int maxWater = 0;
        for(int i = 0; i < list.size(); i++){
            for(int j = i + 1; j < list.size(); j++){
                int ht = Math.min(list.get(i),list.get(j));
                int width = j - i;
                int currWater = ht * width;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }

    //2 Pointer approch
    public static int storeWater1(ArrayList<Integer> height1){
        int maxWater = 0;
        int i = 0;
        int j = height1.size()-1;
        while(i<j){
            int ht = Math.min(height1.get(i),height1.get(j));
            int width = j - i;
            int currWater = ht * width;
            maxWater = Math.max(currWater, maxWater);
            i++;
            j--;
        }
        return maxWater;
    }

    public static void main(String argc[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        

       System.out.println("Maximum water:" +storeWater(height));
      // System.out.println("Max Water:"+storeWater1(height));
    }
}
