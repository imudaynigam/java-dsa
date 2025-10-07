public class FriendsPairing {

    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // be single
        int singleWays = friendsPairing(n - 1);

        //get paired up
        int pairWays = (n - 1) * friendsPairing(n - 2);

        return singleWays + pairWays;
    }

    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
}
