public class GridWayBT {
    // QN: FInd number of ways to reach from (0,0) to (N-1,M-1) in a NxM Grid. Allowed moves- right or down only.
    public static int gridWays(int i,int j,int n,int m){
        //Base cases
        if(i==n-1 && j==m-1){  // condition for last cell.
            return 1;
        }
        if(i==n || j==m){  // For boundaries. To stop the recursion to cross the boundaries.
            return 0;
        }
        int w1 =  gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);
        return w1+w2;

    }
    public static void main(String args[]){
        int n= 3,m=3;
        System.out.println(gridWays(0, 0, n, m));
    }
}
// O(2^(n+m)) will be the time complexity for this one. But if we use permutation and combination it will make it faster. As there is (n-1) ways Down chances and (m-1) rows chances. 
// So permutation will be = (n-1+m-1)!/(n-1)!*(m-1)!
