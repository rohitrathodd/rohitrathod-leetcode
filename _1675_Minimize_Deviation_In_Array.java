import java.util.HashSet;

public class _1675_Minimize_Deviation_In_Array {
    public static int minimumDeviation(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }

        Object[] setObjArr =  set.toArray();
        nums = new int[setObjArr.length];
        int count=0;
        for(Object i: setObjArr){
            nums[count] =(int) i;
            count++;
        }
        int maxIndex = findMax(nums);
        int minIndex= findMin(nums);

        int max = nums[maxIndex];
        int min= nums[minIndex];

        int diff = max - min;


        if(min%2 == 1 && max%2==0){

            nums[maxIndex]=nums[maxIndex]/2;
        }else if(min%2 == 0 && max%2==0){
            nums[maxIndex]=nums[maxIndex]/2;
        }else if(min%2 == 1 && max%2==1){
            nums[minIndex]=nums[minIndex]*2;
        }else
        {
            return max-min;
        }

        while(true){
             maxIndex = findMax(nums);
             minIndex= findMin(nums);

             max = nums[maxIndex];
             min= nums[minIndex];

             int currDiff = max - min;

             if(currDiff>=diff){
                 return currDiff;
             }

            if(min%2 == 1 && max%2==0){

                nums[maxIndex]=nums[maxIndex]/2;
                continue;
            }else if(min%2 == 0 && max%2==0){
                nums[maxIndex]=nums[maxIndex]/2;
                continue;
            }else if(min%2 == 1 && max%2==1){
                nums[minIndex]=nums[minIndex]*2;
                continue;
            }else if(min%2==0 && max%2==0){
                nums[minIndex]=nums[minIndex]/2;
            }
            diff = currDiff;
        }



    }

    public static int findMax(int[] nums){
        int max=nums[0];
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }

        return index;
    }

    public static int findMin(int[] nums){
        int min=nums[0];
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
                index=i;
            }
        }

        return index;
    }

    public static void main(String[] args){
        minimumDeviation(new int[]{7,9,13});
    }
}
