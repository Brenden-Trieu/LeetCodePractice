import java.util.*;

public class App {
    public boolean containsDuplicate(int[] nums) {
        int x, y;
        if (nums != null) {
            x = nums[0];
            if (nums.length != 1) {
                y = nums[1];
            } else {
                return true;
            }

            for (int h = 0; h < nums.length; h++) {
                for (int i = 1; y < nums.length; i++) {
                    if (x == y) {
                        return true;
                    } else {
                        y = nums[i + 1];
                    }
                }
                x = nums[h];
            }
        }
        return false;
    }
}

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }
}

class SolutionHashSet {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num))
                return true;
            seen.add(num);
        }
        return false;
    }
}