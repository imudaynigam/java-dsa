public class RotatedBinary {

    public static int search(int nums[], int target){
        int left=0;
        int right=nums.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            //check for mid
            if(nums[mid]==target){
                return mid;
            }

            //get to know which half is sorted

            //left sorted
            if(nums[left]<=nums[mid]){
                if(nums[left]<=target && target<nums[mid]){
                    right=mid-1; //target is left half
                }
                else{
                    left=mid+1; //target in right
                }
            }

            //right sorted
            else{
                if(nums[mid]<target && target<=nums[right]){
                    left=mid+1; //target in right
                }
                else{
                    right=mid-1; //target in left
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(search(nums,target));
    }
}
