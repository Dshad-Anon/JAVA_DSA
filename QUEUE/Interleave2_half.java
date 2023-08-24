package QUEUE;
// Interleave 2 Halves of a Queue(even length).
// From original take first half and make a new queue(q1) and leave second half as original(q).
// Now each time in original queue we will add(q.add(q1.remove)) from first queue to rear part then from original front.(q.add(q.remove))
// size = q.size() q1=size/2; 
import java.util.*;
public class Interleave2_half {
    public static void interLeave(Queue<Integer> q){
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size();
        for(int i=0;i<size/2;i++){
            firstHalf.add(q.remove());
        }
        while(!firstHalf.isEmpty()){
            q.add(firstHalf.remove());
            q.add(q.remove());
        }

    }
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        interLeave(q);
        // TO print Queue
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
