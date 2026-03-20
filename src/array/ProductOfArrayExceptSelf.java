package array;

public class ProductOfArrayExceptSelf {
    /*
    Problem: Product of array except self
    Link: https://leetcode.com/problems/product-of-array-except-self/
    Difficulty: Medium

    Approach:
    - Take Left Product Array (first should be 1)
    - Take Right Product Array (last should be 1)
    - Multiply their result

    Time Complexity: O(n)
    Space Complexity: O(n) //optimized version uses a single array for these calculations
    */
    public int[] productExceptSelf(int[] nums) {
        int[] leftProductArray = new int[nums.length];
        int[] rightProductArray = new int[nums.length];
        leftProductArray[0] = 1;
        for (int i=1;i<nums.length;i++) {
            leftProductArray[i] = leftProductArray[i-1] * nums[i-1];
        }
        rightProductArray[nums.length-1] = 1;
        for (int i=nums.length-2;i>=0;i--) {
            rightProductArray[i] = rightProductArray[i+1] * nums[i+1];
        }
        int [] res = new int[nums.length];
        for (int i=0;i<nums.length;i++) {
            res[i] = leftProductArray[i] * rightProductArray[i];
        }
        return res;
    }
}
