public class RecursionBasics {
    public static void printDec(int n) {
        if (n == 1) {
            System.out.print(1);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    
    public static int sumOfN(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfN(n - 1);
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return isSorted(arr, index + 1);
    }

    public static int firstOccurrence(int[] arrNew, int key, int index) {
        if (index == arrNew.length) {
            return -1;
        }
        if (arrNew[index] == key) {
            return index;
        }
        return firstOccurrence(arrNew, key, index + 1);
    }
    
    public static int lastOccurrence(int[] arrNew, int key, int index) {
        if (index == arrNew.length) {
            return -1;
        }
        int isFound = lastOccurrence(arrNew, key, index + 1);
        if (isFound != -1) {
            return isFound;
        }
        if (arrNew[index] == key) {
            return index;
        }
        return -1;
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static int optimizedPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(x, n / 2);
        int halfPowerSq = halfPower * halfPower;

        if (n % 2 != 0) {
            return x * halfPowerSq;
        }
        return halfPowerSq;
    }
    
    public static void main(String[] args) {
        int n = 10;
        int[] arr = { 1, 2, 3, 4 };

        printDec(n);
        System.out.println();

        printInc(n);
        System.out.println();

        System.out.println(factorial(5));

        System.out.println(sumOfN(8));

        System.out.println(fib(6));

        System.out.println(isSorted(arr, 0));

        int[] arrNew = { 2, 4, 3, 6, 5, 8, 3, 5, 6, 8 };

        System.out.println(firstOccurrence(arrNew, 5, 0));

        System.out.println(lastOccurrence(arrNew, 5, 0));

        System.out.println(power(2, 5));

        System.out.println(optimizedPower(2, 5));
    }
}
