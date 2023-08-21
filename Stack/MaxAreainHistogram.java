package Stack;
// Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, 
// return the area of the LARGEST RECTANGLE in the histogram.

import java.util.Stack;

public class MaxAreainHistogram {

    public static void nextSmallerright(){

    }
    public static void maxArea(int arr[]){
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        int maximumArea = 0;
        //Next smaller Right
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;  // it will be equal to index.
            }else{
                nsr[i] = s.peek();    // equal to top.
            }
            s.push(i);
        }
        
         s = new Stack<>();

        //Next smaller left
        for(int i=0; i<arr.length;i++){
            while(!s.isEmpty()&& arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //Current Area Width = j-i-1 = nsr[i] -nsl[i]-1
        for(int i=0;i<arr.length;i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1 ;
            int currArea = height * width;
            maximumArea = Math.max(maximumArea, currArea);
        }
        System.out.println("Max area in histogram = "+maximumArea);
    }
    public static void main(String args[]){
        int heights[] = {2,1,5,6,2,3};  // heights in histogram
        maxArea(heights);

    }
}
