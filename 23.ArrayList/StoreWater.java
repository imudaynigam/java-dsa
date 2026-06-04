import java.util.*;

public class StoreWater {

    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        int left = 0;
        int right = height.size() - 1;

        while (left < right) {
            int ht= Math.min(height.get(left), height.get(right));
            int width = right - left;
            int currentWater = ht * width;
            maxWater = Math.max(maxWater, currentWater);

            if (height.get(left) < height.get(right)) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>(
                Arrays.asList(1, 8, 6, 2, 5, 4, 8, 3, 7));
        System.out.println(storeWater(height));
    }
        

}
