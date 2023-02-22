public class _540_Single_Element_In_Sorted_Array {
    public int singleNonDuplicate(int[] nums) {

        int start=0;
        int end=nums.length-1;

        while(start<end){

            int mid = start + (end-start)/2;

            if(mid%2==0){
                if(nums[mid]==nums[mid+1]){
                    start=mid+2;
                }else{
                    end=mid-1;
                }

            }else{
                if(nums[mid]==nums[mid-1]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }

        }

        return nums[start];
    }
}
