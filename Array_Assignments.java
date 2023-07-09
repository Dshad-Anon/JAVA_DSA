public class Array_Assignments {

    /* Question number 1 to find if there are duplicates or not.
     int nums[] = {1,2,3,4};
     System.out.println(isThereDuplicates(nums));
     */
    // public static boolean isThereDuplicates(int[] nums){  
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //             if(nums[i]==nums[j]){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    /* To find the target in and return the index value of the integer or -1 if it is not in nums. 
    But the time complexity is more. In the question it is asked to be O(log n).
    int nums[]= {4,5,6,7,0,1,2};
    int target = 4;
    */ 
    // public static int getIndex(int[] nums,int target){
    //     for(int i=0;i<nums.length-1;i++){
    //         if(nums[i]==target){
    //             return i;
    //         } 
    //     }
    //     return -1;
    // }

    // public static int minSearch(int[] nums){
    //     int left = 0;
    //     int right = nums.length - 1;
        
    //     while(left<right){
    //         int mid = left + (right -left)/2 ;
    //         if(mid>0 && nums[mid-1]> nums[mid]){
    //             return mid;
    //         }
    //         else if(nums[left] <= nums[mid] && nums[mid] > nums[right] ){
    //             left = mid+1;
    //         }
    //         else{
    //             right = mid -1 ;
    //         }
    // }
    //     return left;
    // }

    public static int buyStock(int[] prices){
        int buyingPrices = Integer.MAX_VALUE;
        int max_Profit = 0;
        for(int i=0;i<prices.length;i++){
            if(buyingPrices<prices[i]){
                int profit = prices[i] - buyingPrices;
                max_Profit = Math.max(max_Profit,profit);   
            }
            else{
                buyingPrices = prices[i];
            }
        } 
        return max_Profit;
       
    }
    
    public static void main(String[] args){
      int prices[] = {7,6,4,3,1};
      System.out.println("The total profit will be: "+ buyStock(prices));
    }
}
