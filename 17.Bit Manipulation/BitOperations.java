public class BitOperations {
    
    public static int getIthBit(int n, int i) {
        int mask = 1 << i;
        if ((n & mask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int mask = 1 << i;
        return n | mask;
    }

    public static int clearIthBit(int n, int i) {
        int mask = 1 << i;
        return n & (~mask);
    }

    public static int updateIthBit(int n, int i, int newBit) {
        int clearedN = clearIthBit(n, i);
        int mask = newBit << i;
        return clearedN | mask;
    }
    
    public static int clearLastIBits(int n, int i) {
        int mask = (~0) << i;
        return n & mask;
    }

    public static int clearBitsInRange(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int mask = a | b;
        return n & mask;
    }

    public static void main(String[] args) {
        System.out.println(getIthBit(10, 3));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 3));
        System.out.println(updateIthBit(10, 02, 1));
        System.out.println(clearLastIBits(15, 2));
        System.out.println(clearBitsInRange(10, 2, 4));
    }

}
