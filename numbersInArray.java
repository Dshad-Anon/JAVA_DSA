public class numbersInArray {

    // Question number 1. PRINT THE NUM OF 7'S THAT ARE IN THE 2D ARRAY.   
    /*
     int array[][] = {{4,7,8},{8,8,7}};
     int key = 7;
     */
    public static int countOccurences(int array[][],int key){
        int count = 0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(array[i][j]==key){
                    count += 1;
                }
            }
        }
        System.out.println("The frequency of occurence of number "+key+" is "+count);
        return count;
    }

    // Question Number 2: PRINT OUT THE SUM OF THE NUMBERS IN THE SECOND ROW OF THE "NUMS" ARRAY.
    /* int nums[][]= {{1,4,9},{11,4,3},{2,2,3}};
     */
    public static int sumOfRow(int nums[][]){
        int rowSum = 0;
        for(int j=0;j<nums[0].length;j++){
            rowSum += nums[1][j];    
         }
        System.out.println("The sum of the second row is "+rowSum);
        return rowSum;
    }

    public static void printMatrix(int[][] nums){
        int row = nums.length;
        int column = nums[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }  
    }

    public static void printTransposeOfMatrix(int[][] nums){
        int row = nums.length;
        int column = nums[0].length;
        int[][] transpose = new int[column][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                transpose[j][i] = nums[i][j];
            }
        }  
        printMatrix(transpose);
    }
    

    public static void main(String[] args){
        int nums[][]= {{2,3,7},{5,6,7}};
        //countOccurences(array, key);
        //sumOfRow(nums);
        printTransposeOfMatrix(nums);
    }
}
