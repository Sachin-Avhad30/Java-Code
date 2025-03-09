import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class FirstGreedy {

    //when end array is sorted;
    public static void maxNumberofActivity(int start[],int end[]){

        int noOfactivity = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        noOfactivity = 1;
        ans.add(0);
        int preEnd = end[0];
        for(int i = 1; i < start.length; i++){
            if(start[i] >= preEnd){
                noOfactivity++;
                ans.add(i);
                preEnd = end[i];
            }
        }

        System.out.println("Maximum number of activity person can perform :"+noOfactivity);
        for(int i = 0; i < ans.size(); i++){
            System.out.println("A"+ans.get(i));
        }
        System.out.println();
    }


    // //when end array is  not sorted;
    // public static void maxNumberofActivity(int start[],int end[]){
        
    //     int activity[][] = new int[start.length][3];

    //     for(int i = 0; i < start.length;i++){
    //         activity[i][0] = i;
    //         activity[i][1] = start[i];
    //         activity[i][2] = end[i];
    //     }
    //     for(int i = 0; i < start.length; i++){
    //         for(int j = 0; j < 3;j++){
    //             System.out.print(activity[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
    //     System.out.println();
    //     Arrays.sort(activity,Comparator.comparingDouble(o->o[2]));
    //     for(int i = 0; i < start.length; i++){
    //         for(int j = 0; j < 3; j++){
    //             System.out.print(activity[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
    //     System.out.println();
    //     int maxCount = 0;
    //     ArrayList<Integer> ans = new ArrayList<>();

    //     maxCount = 1;
    //     ans.add(activity[0][0]);
        
    //     int lastActTime =  activity[0][2];
    //     for(int i = 1; i < end.length; i++){
    //         if(activity[i][1] >= lastActTime){
    //             maxCount++;
    //             ans.add(activity[i][0]);
    //             lastActTime = activity[i][2];
    //         }
    //     }
    //     System.out.println("Maximum number of actvity that can perform : "+maxCount);
    //     System.out.println("Activity Name");
    //     for(int i = 0; i < ans.size(); i++){
    //         System.out.println("A"+ans.get(i));
    //     }
    //     System.out.println();
    // }

    
    public static void main(String argc[]){
        int start[] = {1,3,0,5,8,5};

        int end[] = {2,4,6,7,9,9};

        // int start[] ={0,1,3,5,5,8};
        // int end[] ={6,2,4,7,9,9};

        maxNumberofActivity(start,end);
    }
}
