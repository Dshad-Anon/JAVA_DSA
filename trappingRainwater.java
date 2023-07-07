public class trappingRainwater{

    /* Conditions needed. */
    // 1. To fill a bar the minimum number of bars must be greater than 2. (MIN. NO. OF BARS>2).
    // 2. If bars are in ascending and descending order. NO water will be trapped.
    // 3. Left and right maximum boundary should be checked. And the minimum should be taken from both of the boundary. For eg. IN 6,2,8 capacity to hold water will be. (6-2)*width.
    //But in case of 10,6,2,8 minimum will be 8. So conditions changes here.

    public static int getTrappedWater(int height[]){
        // calculate left max boundary  - in array form
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }
        // calculate right max boundary - in array form
        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }
        //loop
        int trappedWater = 0;
        for(int i=0;i<height.length;i++){
            // waterLevel = min(leftmax bound, rightmax bound)
            int waterLevel = Math.min(leftMax[i],rightMax[i]);

            //trappedWater = waterLevel - height[i]
            trappedWater += waterLevel -height[i]; // As we will go on adding the trapped water 
        }

        return trappedWater ;
        
    }
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(getTrappedWater(height));
}
}