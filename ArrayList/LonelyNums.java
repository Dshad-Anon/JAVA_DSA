package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

//QN: You are given an integer arraylist nums. A number x is lonely when it appears only once, and no adjacent numbers(i.e. x+1 and x-1) appear in the arraylist.

public class LonelyNums {

    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums){
        Collections.sort(nums);
        ArrayList <Integer> list = new ArrayList<>();
        for(int i=1;i<nums.size()-1;i++){
            if(nums.get(i-1)+1 < nums.get(i) && nums.get(i)+1< nums.get(i+1)){
                list.add(nums.get(i));
            }
        }
        if(nums.size()==1){
            list.add(nums.get(0));
        }
        if(nums.size()>1){
            if(nums.get(0)+1<nums.get(1)){
                list.add(nums.get(0));
            }
            if(nums.get(nums.size()-2)+1<nums.get(nums.size()-1)){
                list.add(nums.get(nums.size()-1));
            }
        }
        return list;
    }

    // Most frequent number following key.
    // You are given an integer Arraylist nums. You are also given an integer key, which is present in the nums.
    public static int mostFrequent(ArrayList<Integer> nums,int key){
        int[] result = new int[1000];

        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i)== key){
                result[nums.get(i+1)-1]++;  // here from the index of i+1 which will be 100 and -1 will be 99 and it is counted. 
            }
        }
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for(int i=0;i<1000;i++){  // later here in index 99 100 is stored.
            if(result[i]>max){
                max = result[i];
                ans = i+1;   // so while 99+1 100 will come out ans.
            }
        }
        return ans;
    }
    
    public static void main(String args[]){
        ArrayList <Integer> nums= new ArrayList<>();
        nums.add(1);
        nums.add(100);
        nums.add(200);
        nums.add(1);
        nums.add(100);
        System.out.println(mostFrequent(nums, 1));
    }
}
