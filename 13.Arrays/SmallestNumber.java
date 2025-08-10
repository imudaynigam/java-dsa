import java.util.*;

public class SmallestNumber {
    public static int SmallestNumber(int numbers[]) {
        int smallest=Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("Smallest value is: " + smallest);
        return smallest;
    }

    public static void main(String[] args) {
        int numbers[]={2,3,6,7,1,5,9};
        SmallestNumber(numbers);
    }
}
