import java.util.*;

public class MaxSubSum {

    //brute force
    public static void bruteForce(int arr[]){
        
        int maxsum=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int currsum=0;
                for(int k=i; k<=j; k++){
                    currsum +=arr[k];
                   
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("Max sum= " + maxsum);
    }


    //prefix sum
    public static void prefixSum(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int [arr.length];

        prefix[0]=arr[0];

        //calculate prefix array
        for(int i=1; i<prefix.length; i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                currSum= i==0 ? prefix[j]:prefix[j]-prefix[i-1];

                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max sum= " + maxSum);
    }


    //Kadane's Algo

    public static void Kadane(int arr[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;

        for(int i=0; i<arr.length; i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("Kadane's Max Sum : " + ms);
    }


    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        bruteForce(arr);
        prefixSum(arr);
        Kadane(arr);
    }
}
