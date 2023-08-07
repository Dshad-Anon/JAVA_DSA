package ArrayList;

import java.util.ArrayList;

// For given n lines on x-axis , use 2 lines to form a c ontainer such that it holds maximum water height = [1,8,6,2,5,4,8,3,7]
public class MostWaterCont {

    public static int mostWaterCapacityContainer(ArrayList <Integer> h){
        int maxWater=0;
        // Brute force - 0(n^2)
        for(int i=0;i<h.size();i++){
            for(int j=i+1;j<h.size();j++){
                int height = Math.min(h.get(i),h.get(j));
                int width = (j-i);
                int currWater = height * width;
                maxWater = Math.max(maxWater,currWater);
            }
        }
        return maxWater;
    }

    
    // For O(n) we use the 2 Pointer Approach.
    // In this approach we start with ind 0 as lp and h.size()-1 as rp(right pointer). if(lp<rp) lp++ else rp--;
    public static int storeWater(ArrayList <Integer> height){
        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1;
        while(lp<rp){
            //calc water aresa
            int ht = Math.min(height.get(lp),height.get(rp));
            int width = rp -lp;
            int currWater = ht*width;
            maxWater = Math.max(maxWater,currWater);
            //update pointers
            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }

        }
        return maxWater;
    }
    public static void main(String args[]){
        ArrayList <Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        
        System.out.println(storeWater(height));
    }
}
