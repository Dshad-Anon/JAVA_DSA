package ArrayList;

import java.util.ArrayList;

// Find if any pair in a Sorted ArrayList has a target sum.
public class PairSum {
    // //Brute Force. O(n^2)
    // public static boolean pairSum(ArrayList<Integer> list,int target){
    //     for(int i=0;i<list.size();i++){
    //         for(int j=i+1;j<list.size();j++){
    //             if(list.get(i)+list.get(j)== target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    //     list.add(1);
    //     list.add(2);
    //     list.add(3);
    //     list.add(4);
    //     list.add(5);
    //     list.add(6);

    // 2 Pointer Approach 
    // cases if num on index if(lp+rp== target){ return } else if{lp+rp< target} lp++ else rp--
    public static boolean pairSumPointerApproach(ArrayList<Integer> list ,int target){
        int lp = 0;
        int rp = list.size()-1;
        while(lp!=rp){
        if(list.get(lp)+list.get(rp)==target){
            return true;
        }
        else if (list.get(lp)+list.get(rp)>target) {
            lp++;
        } else {
            rp--;
        }
    }
        return false;
    }

    // Sorted and rotated : Find if any pair in a Sorted and Rotated ArrayList has a target sum.
    public static boolean pairSum2(ArrayList<Integer>list,int target){
        int bp = -1;
        int n = list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){ // breaking point
                bp=i;
                break;
            }
        }
        int lp = bp+1; // smallest
        int rp = bp; // largest
        while(lp!=rp){
            // case 1
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }//case 2
            else if(list.get(lp)+list.get(rp)<target){
                lp = (lp+1)% n;
            }else{
                rp = (rp-1+n)%n;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6); 
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 10;
        System.out.println(pairSum2(list, target));
}}

