public class OddOrEven {

    public static void checkOddEven(int n) {
        if ((n & 1) == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }
    public static void main(String[] args) {
        checkOddEven(5);
        checkOddEven(10);
        checkOddEven(0);
        checkOddEven(1);
    }
}