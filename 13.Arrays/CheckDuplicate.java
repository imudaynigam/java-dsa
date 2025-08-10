public class CheckDuplicate {
    public static boolean checkDuplicate(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]={2,4,6,8,2,3,4};
        System.out.println(checkDuplicate(arr));
    }
}
