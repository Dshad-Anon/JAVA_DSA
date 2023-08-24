package QUEUE;
import java.util.*;
public class Program_Deque {
    public static void main(String args[]){
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);
        System.out.println(deque.getFirst());
    }
}
