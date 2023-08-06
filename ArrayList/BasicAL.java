package ArrayList;
import java.util.ArrayList;

public class BasicAL{
    public static void main(String args[]){
        // ClassName objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.add(1,10); // Take O(n) time complexity.

        // TO PRINT THE ARRAY LIST
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        // System.out.println(list); // O(1)

        // // TO perform get operation - O(1)
        // int ele = list.get(2);
        // System.out.println(ele);

        // // Delete.
        // list.remove(2);
        // System.out.println(list);

        // Set.
        // list.set(1,10);
        // System.out.println(list);
        
        // Contains
        // System.out.println(list.contains(11));
        // System.out.println(list);

        // SIZE method or func
        // System.err.println(list.size() );
    }
}