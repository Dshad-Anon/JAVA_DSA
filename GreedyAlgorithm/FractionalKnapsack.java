package GreedyAlgorithm;

import java.util.*;


//Given the weights and values of N items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack.
// value =[60,100,120] weight=[10,20,30]  Let W is 50. Answer = 240.
// Look up to the ratio and keep in descending order if everthing goes up put it over. And if not multiply ratio with needed capacity.
public class FractionalKnapsack {

    public static void main(String args[]){
        int val[] = {60,100,120};
        int weight []= {10,20,30} ;
        int W = 50;
        double ratio[][] = new double[val.length][2];

        //0th col => idx; 1st col => ratio

        for(int i=0;i<val.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }

        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        int capacity = W;
        int finalVal = 0;

        for(int i=ratio.length-1;i>=0;i--){ // here idx gives the index of the ratio we had calulated not (i) of the loop which has already ended above.
            //Includes the full item.
            int idx = (int) ratio[i][0];
            if(capacity>=weight[idx]){
                finalVal +=val[idx];
                capacity -=weight[idx];
            }else{
                //includes fractional item
                finalVal += (ratio[i][1]*capacity); // here ratio and capacity which is remaining will be multiplied.
            }
        }   
        System.out.println("Final value = "+ finalVal);

     }
}
