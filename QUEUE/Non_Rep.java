package QUEUE;
// First non-repeating letter in a stream of characters.
// For eg. a a b c c x b  ANs: a -1 b b b b x
import java.util.*;
public class Non_Rep {
    public static void printNonRepeating(String str){
        int freq[] = new int[26];  // 'a' - 'z'
        Queue<Character> q = new LinkedList<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            while(!q.isEmpty() && freq[q.peek()-'a']>1){  // checks if queue is empty or not and checks that the frequency of the val in array freq[] is not more than 1.
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1+" ");
            }else{
                System.out.print(q.peek()+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        String str = "aabccxb";
        printNonRepeating(str);
    }
}
