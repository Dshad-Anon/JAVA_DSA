public class N_Queens_BT {
    //Place N queens on a NxN chessboard such that no 2 queens can attak each other. 

   public static boolean isQueenValid(char board[][],int row,int column){
     // check queen conditions for above only. As we go from top to bottom.

     // Vertical up(same coln).
     for(int i=row-1;i>=0;i--){
        if(board[i][column]=='Q'){
            return false;
        }
     }

     // diagonal left up. row-1,col-1
     for(int i=row-1,j=column-1;i>=0 && j>=0;i--,j--){
        if(board[i][j]=='Q'){
            return false;
        }
     }
     // diagonal right up. row-1, col+1  // column is increasing so j will be length of board.
     for(int i=row-1,j=column+1;i>=0 && j<board.length;i--,j++){
        if(board[i][j]=='Q'){
            return false;
        }
     }
     return true;
   }

   public static void queensInRow(char board[][],int row){
    // base case
    if(row == board.length){
        printBoard(board);
        // To count total num of ways we can solve n queens prob.
        count++;
        return;
    }

    // To count total num of ways in which we can solve N QUEENS problem. Add a condition in base case 
    
    //column loop
    for(int j=0;j<board.length;j++){
        if(isQueenValid(board, row, j)) {
             board[row][j]= 'Q';
             queensInRow(board, row+1); // funct call
             board[row][j]='x'; // backtracking call the value is formatted so we again put the value or row column as x.
        } 
    }
   }

// // To only print the only one solution.
//    public static boolean queensInRow(char board[][],int row){
//     // base case
//     if(row == board.length){
//         return true;
//     }

//     // To count total num of ways in which we can solve N QUEENS problem. Add a condition in base case 
    
//     //column loop
//     for(int j=0;j<board.length;j++){
//         if(isQueenValid(board, row, j)) {
//              board[row][j]= 'Q';
//              if(queensInRow(board, row+1)){
//                 return true;
//              } 
//              board[row][j]='x'; // backtracking call the value is formatted so we again put the value or row column as x.
//         } 
//     }
//     return false;
//    }

 // CONDITION TO CHECK IT IN MAIN.
// if(queensInRow(board, 0)){
//             System.out.println("SOln possible");
        //     printBoard(board);
//         }else{
//             System.out.println("SOln is not possible");
//         }
    public static void printBoard(char board[][]){
        System.out.println("-----Chess board-------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int count = 0;
    public static void main(String args[]){
        int n= 4;
        char board[][] = new char[n][n];
        // Initialize 
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               board[i][j] = 'x';
            }
        }
        queensInRow(board, 0);
        
      //System.out.println("Total ways to solve n queens ="+count);
}
}
