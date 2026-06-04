import java.util.*;

public class FindMax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(15);
        list.add(25);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        
        int maxUsingCollections = Collections.max(list);
        
        for (int i = 0; i < list.size(); i++) {
            maxUsingCollections = Math.max(maxUsingCollections, list.get(i));
        }
        
        System.out.println();
        System.out.println("Maximum value using loop: " + max);
        System.out.println("Maximum value using Collections: " + maxUsingCollections);
        
    }
}
