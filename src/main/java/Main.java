import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        ResizableArray arr = new ResizableArray();
//
//        arr.push(10);
//        arr.push(10);
//        arr.push(10);
//
//        arr.printArray();
       int[] arr = {1,2,3,4,5};
//
//        MaximumSumSubarray maximumSumSubarray = new MaximumSumSubarray();
//        int resposta  = maximumSumSubarray.maxSubArray(arr);
//
//        JumpGameProblem jumpGameProblem = new JumpGameProblem();
//        System.out.println(jumpGameProblem.canJump(arr));




        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
      int[] resp =   productOfArrayExceptSelf.productExcept(arr);

        System.out.println(Arrays.toString(resp));














    }

}
