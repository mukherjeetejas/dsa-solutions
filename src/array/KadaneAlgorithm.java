package array;

class KadaneAlgorithm {
    /*
    Problem: Maximum Subarray Sum
    Link: https://leetcode.com/problems/maximum-subarray/
    Difficulty: Medium

    Approach:
    - At each step we consider should we start afresh or continue subarray (negative nums)
    - 2 Math.max() comparisons

    Time Complexity: O(n)
    Space Complexity: O(1)
    */
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0], currSum = nums[0];
        for (int i=1;i<nums.length;i++) {
            currSum += nums[i];
            currSum = Math.max(currSum, nums[i]);
            maxSoFar = Math.max(currSum, maxSoFar);
        }
        return maxSoFar;
    }
}
