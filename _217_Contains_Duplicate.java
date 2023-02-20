import java.util.HashMap;

public class _217_Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {


        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
}
