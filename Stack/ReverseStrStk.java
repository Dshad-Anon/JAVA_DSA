package Stack;
//QN. Reverse a String using a Stack.

import java.util.Stack;

public class ReverseStrStk {
    
    public static String reverseStr(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuffer st1 = new StringBuffer("");
        while(!s.isEmpty()){
            char curr = s.pop();
            st1.append(curr);
        }
         return st1.toString();  // As it's a string buffer we need to convert it to string.
    }
    public static void main(String args[]){
        String str = "abc";
        System.out.println(reverseStr(str));
    }
}
