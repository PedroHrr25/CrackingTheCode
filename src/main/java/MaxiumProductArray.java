public class MaxiumProductArray {

//Given an integer array nums, find a
//subarray
// that has the largest product, and return the product.
//
//The test cases are generated so that the answer will fit in a 32-bit integer.
//
//
//
//Example 1:
//
//Input: nums = [2,3,-2,4]
//Output: 6
//Explanation: [2,3] has the largest product 6.
//Example 2:
//
//Input: nums = [-2,0,-1]
//Output: 0
//Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

    //156/190

    private int nums[];

    public MaxiumProductArray() {
    }

    public int maxProduct (int[] nums){
        int ans = Integer.MIN_VALUE;
                if(nums.length ==1){
                    return nums[0];
                }

                int currentProduct = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] !=0) {
                currentProduct = currentProduct * nums[i];
                ans = Math.max(ans, currentProduct);
            }
            else {
                currentProduct = 1;
            }
        }
        for (int i = nums.length -1; i >= nums.length; i--) {
            if (nums[i] !=0) {
                currentProduct = currentProduct * nums[i];
                ans = Math.max(ans, currentProduct);
            }
            else {
                currentProduct = 1;
            }
        }

        return ans;

    }




}
