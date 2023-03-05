import java.util.Arrays;

public class _912_Sort_Array {

    public int[] sortArray(int[] nums) {

        if(nums.length==1){
            return nums;
        }

        int mid = nums.length/2;

        int[] left = sortArray(Arrays.copyOfRange(nums,0,mid));
        int [] right = sortArray(Arrays.copyOfRange(nums,mid,nums.length));

        return merge(left,right);
    }

    public int[] merge(int[] arr1, int[] arr2){

        int[] arr = new int[arr1.length+arr2.length];

        for(int i=0,j=0,k=0;(j<arr1.length||k<arr2.length) && i<arr.length;i++){

            if ((j<arr1.length || k==arr2.length) && arr1[j] <= arr2[k]){
                arr[i]=arr1[j];
                j++;
            }else{
                arr[i]=arr2[k];
                k++;
            }

        }
        return arr;
    }
}
