public class searchSortedMatrix {
    // Here the rows and columns are in sorted order.

    //Brute Force which time complexity will be O(n^2) will be the worst case here.
    // Row wise sort will make time complexity nlog(n).
    // Staircase search. Two non main diagonal matrix end cells will start search. (0,m-1) &(n-1,0).
    // (0,m-1) if key<cell value(IN LEFT column --) key > cell value(IN BOTTOM row++).
    // (n-1,0) if key> cell value(IN RIGHT) key < cell value(IN UP)

    public static boolean stairCaseSearch(int matrix[][],int key){
        // FOR THE (0,m-1) cell as starting point.
        // int row = 0,col = matrix[0].length-1;
        // while(row<matrix.length && col>=0){
        //     if(key== matrix[row][col]){
        //         System.out.println("Found key at point ("+row+","+col+")");
        //         return true;
        //     }
        //     else if(key<matrix[row][col]){
        //         col--;
        //     }
        //     else{
        //         row++;
        //     }
        // }

        //For (n-1,0) cell as starting point.
        int row = matrix.length-1 ; 
        int column = 0;
        while(row>=0 && column<matrix.length){
            if(matrix[row][column]==key){
                System.out.println("The key point is found at index point ("+row+","+column+")");
                return true;
            }
            else if(key>matrix[row][column]){
                column++ ;
            }
            else{
                row-- ;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args){
        int matrix[][] = {{10,20,30,40},
                         {15,25,35,45},
                         {27,29,37,48},
                         {32,33,39,50}};
        int key = 50;
        stairCaseSearch(matrix, key);
    }
}
