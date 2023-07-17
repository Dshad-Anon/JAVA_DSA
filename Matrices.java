
public class Matrices {
    public static boolean searchKey(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==key){
                System.out.println("Element found at cell ("+i+","+j+")");
                return true;
            }
        } 
    }
    System.out.println("Not found");
    return false;
    }

    public static int Largest(int matrix[][]){
        //int largest_val = Integer.MIN_VALUE;
        int smallest_val = Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                //largest_val = Math.max(matrix[i][j],largest_val);
                smallest_val = Math.min(matrix[i][j],smallest_val);
            }
        }
        return smallest_val;
    }
     
    public static void printSpriral (int matrix[][]){
        int startRow = 0;
        int endRow = matrix.length-1;
        int startColumn = 0;
        int endColumn = matrix[0].length-1;

        while (startColumn<=endColumn && startRow<=endRow) {
            //top row
            for(int j=startColumn;j<=endColumn;j++){
                System.out.print(matrix[startRow] [j]+" ");
            }
            // Right column
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endColumn]+" ");
            }
            //bottom boundary
            for(int j=endColumn-1;j>=startColumn;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            // left
             for(int i=endRow-1;i>=startRow+1;i--){
                if(startColumn==endColumn){
                    break;
                }
                System.out.print(matrix[i][startColumn]+" ");
            }
            startColumn++;
            startRow++;
            endColumn--;
            endRow--;
            }
            
        }
    
    public static int sumOfDiagonal(int matrix[][]){  
        int sum = 0;
        for(int i=0;i<matrix.length;i++){
            //main diagonal
            sum += matrix[i][i];
            // The sub diagonal of matrix.
            if(i != matrix.length-1-i)
                sum += matrix[i] [matrix.length-1-i];
        }
        return sum;
    }
    //O(n^2) Time complexity.
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             if(i==j){
    //                  sum += matrix[i][j];
    //             }
    //             else if(i+j==matrix.length-1){
    //                 sum += matrix[i][j];
    //             }
    //         }
    //     }
    //     return sum ;
    // }
    public static void main(String args[]){
    int matrix [][] =  {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
    System.out.println(sumOfDiagonal(matrix));
    }
}


 //int key = 3;
    // int matrix[][] = new int[3][4];
    // int n = 3;
    // int m = 4;
    // Scanner sc = new Scanner(System.in);
    // for(int i=0;i<n;i++){
    //     for(int j=0;j<m;j++){
    //         matrix[i][j] = sc.nextInt();
    //     }
    // }

    // //OUTPUT
    // for(int i=0;i<3;i++){
    //     for(int j=0;j<4;j++){
    //         System.out.print(matrix[i][j]+" ");
    //     }
    //     System.out.println();
    // }
    // System.out.println(Largest(matrix));
    // searchKey(matrix, key);