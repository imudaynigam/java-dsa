public class GridWays {
    public static int gridWays(int i, int j, int m, int n){
        //base case
        if(i == m-1 && j == n-1){
            return 1;
        }
        else if(i == m || j == n){
            return 0;
        }

        //recursion
        int w1 = gridWays(i+1, j, m, n); //downwards
        int w2 = gridWays(i, j+1, m, n); //rightwards

        return w1 + w2;
    }

    public static void main(String[] args) {
        int m = 3, n = 3;
        System.out.println("Number of ways to reach from (0,0) to (" + (m-1) + "," + (n-1) + "): " + gridWays(0, 0, m, n));
    }
}
