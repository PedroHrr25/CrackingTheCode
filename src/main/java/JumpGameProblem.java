public class JumpGameProblem {



    //You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
    //
    //Return true if you can reach the last index, or false otherwise.
      private  int nums[];


    public JumpGameProblem() {
    }
//int reachable = 0;
//       for(int i = 0; i < nums.length; i ++) {
//           if(i > reachable) return false;
//           reachable = Math.max(reachable, i + nums[i]);
//       }
//       return true;
//    } melhor solução


    public boolean canJump(int[] nums){

      int maxReachable = nums[0];
      int i = 1;

      while (i<nums.length && maxReachable >=1){
          if (i + nums[i] > maxReachable){
              maxReachable = i + nums[i];
          }
          i++;
      }

      if (maxReachable >= nums.length - 1){
          return  true;
      }

      else
          return false;
    }


}

