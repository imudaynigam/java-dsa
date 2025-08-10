import java.util.*;

public class LinearSearch{

    public static int linearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
     public static void main(String[] args) {
        int numbers[]={1,2,4,6,8,9,12,45};
        int key=12;

        int index=linearSearch(numbers,key);

        System.out.println(index);
     }


}