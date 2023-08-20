package Stack;
import java.util.*;
//Push at the bottom of the stack.
public class PushatBtm {
    //Using recursive method without using extra memory. O(n).
    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    

    public static void main(String args[]){
        // IN This recursion method we will take each element out and when it's null we push at the bottom and again put it back.
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s,4);
        while(!s.empty()){
            System.out.println(s.pop());
    
        }
    }
}
