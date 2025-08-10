import java.util.*;

public class LargestNumber {
    
    public static int largestNumber(int numbers[]){
        int largest=Integer.MIN_VALUE; //-infinity

        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
            return largest;
    }

    public static void main(String[] args) {
        int numbers[]={3,5,2,8,4,6};
        System.out.println("Largest Number is: " + largestNumber(numbers));
    }

}
