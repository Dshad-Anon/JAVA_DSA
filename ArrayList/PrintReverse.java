package ArrayList;

import java.util.ArrayList;

public class PrintReverse {
    public static void main(String args[]){
        ArrayList <Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(5);
        //Reverse print -O(n)
        // for(int i=list.size()-1;i>=0;i--){
        //     System.out.print(list.get(i)+" "); // here list.get takes index so loop starting from list.size()-1 instead of list.size only which gives length.
        // }
        // System.out.println();
        // System.out.println(list.size());

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(11);
        list.add(12);
        int maxm = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){ //O(n)
            maxm = Math.max(maxm, list.get(i)); // i is only the index while get will give the value here.
        }
        System.out.println(maxm);
    }
}
