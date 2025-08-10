import java.util.*;

public class BinarySearch {
    
    public static int binarySearch(int array[],int key){
        int low=0;
        int high= array.length-1;

        while ( low <= high){
            int mid=low+(high-low)/2;

            if(array[mid]==key){
                return mid;
            }
            if(array[mid]<key){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[]={2,4,6,8,11,13,15,19};
        int key=13;

        System.out.println("Key found at :" + binarySearch(array,key));
    }

}
