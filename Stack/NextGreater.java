package Stack;
// The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.

import java.util.Stack;

public class NextGreater {
    public static void main(String args[]){
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            // s.peek gives the index and arr[idx] is checked.
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            //Check if stack is empty or not.
            if(s.isEmpty()){
                nextGreater[i] = -1;
            }
            else{
                nextGreater[i] = arr[s.peek()];
            }
            //push it into the stack.
            s.push(i);
        }
        for(int i=0;i<nextGreater.length;i++){
            System.out.print(nextGreater[i]+" ");
        }
        System.out.println();
        
    }
}
