package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

//QN: We are given an infinite supply of denominations [1,2,5,10,20,50,100,500,2000].
//Find min no. of coins/notes to make change for a value V.
public class MoneyChanges {
    public static void main(String args[]){
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins,Comparator.reverseOrder()); // To sort in reverse can't use the primitive one.

        int countofCoins = 0;
        int amount = 1058;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    countofCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("Total (min) coins/ notes used = "+countofCoins);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
}
