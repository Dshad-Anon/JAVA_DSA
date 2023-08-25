package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String args[]){
        int start[] = {1,3,0,5,8,5};
        int end[] = { 2,4,6,7,9,9};

        // //sorting if the end time isn't sorted.
        // int activities[][] = new int[start.length][3];
        // for(int i=0;i<start.length;i++){
        //     activities[i][0] = i;
        //     activities[i][1] = start[i];
        //     activities[i][2] = end[i];
        // }
        // //lambda function -> shortform of function comparator which helps in sorting java objs.
        // Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));

        //end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st activity
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];
        for(int i=1;i<end.length;i++){
            if(start[i]>=lastEnd){
                //activity select
                maxAct++;
                ans.add(i);
                lastEnd=end[i];
            }
        }
        System.out.println("Max activities = "+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
