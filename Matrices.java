import java.util.Scanner;

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
    public static void main(String[] args){
    int key = 3;
    int matrix[][] = new int[3][4];
    int n = 3;
    int m = 4;
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            matrix[i][j] = sc.nextInt();
        }
    }

    //OUTPUT
    for(int i=0;i<3;i++){
        for(int j=0;j<4;j++){
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println(Largest(matrix));
    searchKey(matrix, key);
    }
}

