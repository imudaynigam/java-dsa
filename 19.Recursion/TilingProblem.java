public class TilingProblem {

    public static int tilingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        //vertical ways
        int verticalWays = tilingProblem(n - 1);

        //horizontal ways
        int horizontalWays = tilingProblem(n - 2);

        return verticalWays + horizontalWays;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
}
