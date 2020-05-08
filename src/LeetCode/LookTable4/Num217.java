package LeetCode.LookTable4;

import java.util.HashSet;
import java.util.Set;

public class Num217 {
    public boolean containsDuplicate(int[] nums) {
        Set set = new HashSet();
        for(int i =0; i<nums.length;i++){
            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
        }
        return false;
    }
}
