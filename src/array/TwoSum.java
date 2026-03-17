package array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /*
    Problem: Two Sum
    Link: https://leetcode.com/problems/two-sum/
    Difficulty: Easy

    Approach:
    - Use HashMap to store value -> index
    - Check complement in map

    Time Complexity: O(n)
    Space Complexity: O(n)
    */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if(map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}