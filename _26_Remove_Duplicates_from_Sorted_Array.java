import java.util.*;

public class _26_Remove_Duplicates_from_Sorted_Array {

    public static void main(String[] args){

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

//    public static int removeDuplicates(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//
//        for(int i=0;i<nums.length;i++){
//            set.add(nums[i]);
//        }
//        System.out.println(set);
//        int index =0;
//        for(int i : set){
//            System.out.println(i);
//            nums[index]=i;
//            index++;
//        }
//        return set.size();
//    }

    public static int removeDuplicates(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
           map.put(nums[i],nums[i]);
        }
        int index =0;
        for(Map.Entry<Integer, Integer> i : map.entrySet()){
            nums[index]=i.getKey();
            index++;
        }
        return map.size();
    }

}
