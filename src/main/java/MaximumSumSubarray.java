public class MaximumSumSubarray {

    //given an integer array nums, find the contiguous subarray ( contaning at least one number)
    //which has the lasgest sum and return its sum

    // kadane's algorithm

    private int nums[];


    public MaximumSumSubarray(int[] nums) {
        this.nums = nums;
    }

    public MaximumSumSubarray() {

    }


    public  int maxSubArray ( int[] nums) {
       int maxSoFar = nums[0];
       int correntSum = nums[0];

       for (int i = 0; i < nums.length; i++) {
           if (correntSum < 0) {
               correntSum = 0;
           }
           correntSum = correntSum + nums[i];
           if (correntSum > maxSoFar) {
               maxSoFar = correntSum;
           }

       }
        System.out.println(maxSoFar);
       return maxSoFar;
   }

}
