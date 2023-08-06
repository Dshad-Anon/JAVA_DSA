package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Swap {

    public static void swap (ArrayList<Integer> l1,int idx1,int idx2){
        int temp = l1.get(idx1);
        l1.set(idx1,l1.get(idx2));
        l1.set(idx2,temp);
    }
    public static void main(String args[]){
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(2);
        l1.add(5);
        l1.add(9);
        l1.add(3);
        l1.add(6);
        int idx1 = 1, idx2 =3;
        System.out.println(l1);
        swap(l1, idx1, idx2);
        System.out.println(l1);

        Collections.sort(l1);
        System.out.println(l1); // Sort array list in ascending order

        //desceding
        Collections.sort(l1,Collections.reverseOrder());
        //Comparator - function which define sorting logic.
        System.out.println(l1);
        
    }
}
