package ArrayList;

import java.util.ArrayList;

public class MultiDime_Arraylist {
    public static void main(String args[]){
        ArrayList<ArrayList <Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1;i<=5;i++){
            list1.add(i*1);  // 1 2 3 4 5 
            list2.add(i*2);  // 2 4 6 8 10
            list3.add(i*3);  // 3 6 9 12 15
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        System.out.println(mainList);

        // nested loop
        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currArrayList = mainList.get(i); // gets the lists
            for(int j=0;j<currArrayList.size();j++){
                System.out.print(currArrayList.get(j)+" ");
            }
            System.out.println();
        }
    }
}
