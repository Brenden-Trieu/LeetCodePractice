package TwoSum;

import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        // Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] + nums[i - 1] == target) {
                result[0] = i - 1;
                result[1] = i;
            }
        }
        return result;
    }
}
