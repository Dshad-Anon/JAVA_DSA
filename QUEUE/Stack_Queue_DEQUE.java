package QUEUE;
// Stack and Queue using Deque.

import java.util.Deque;
import java.util.LinkedList;

public class Stack_Queue_DEQUE {
    static class Stack{
        Deque<Integer> deque = new LinkedList<>();
        public void push(int data){
            deque.addLast(data);
        }
        public int pop(){
            return deque.removeLast();
        }
        public int peek(){
            return deque.getLast();
        }
    }    

    // Implement using Queue using Deque
    static class Queue{
        Deque<Integer> deque = new LinkedList<>();
        public void add(int data){
            deque.addLast(data);
        }
        public int remove(){
            return deque.removeFirst();
        }
        public int peek(){
            return deque.getFirst();
        }
    }
    public static void main(String args[]){
        // Stack s = new Stack();  // class using the above one.
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // System.out.println("Peek ="+ s.peek());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
         System.out.println("PEEK ="+ q.peek());
        System.out.println(q.remove());
       
    }
}
