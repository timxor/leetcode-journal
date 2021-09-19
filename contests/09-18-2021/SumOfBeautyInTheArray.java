class Solution {
    public int sumOfBeauties(int[] nums) {

        // constraints
        //     3 <= nums.length <= 10^5
        //     1 <= nums[i] <= 10^5
        //     10 to the 5th power is 100,000
        //     1 <= i <= nums.length - 2

        // order
        //     nums[j] < nums[i] < nums[k]
        //     0 <= j < i < k <= nums.length - 1

        // check for dirty input
        if (nums == null || nums.length <= 0) { return 0; }

        // result to compute and return
        int sumOfBeautyOfAllNums = 0;

        // iterate over the nums array
        // compute and aggergate its beauty number for each element

        // case 1: if true, result = 2
        //   if nums[j] < nums[i] < nums[k], for all 0 <= j < i and for all i < k <= nums.length - 1.

        boolean caseOne = true;
        for (int i = 1; i <= nums.length - 2; i++) {

            int j = i-1;
            int k = i+1;

            if (nums[j] >= nums[i] || nums[i] >= nums[k]) {
                caseOne = false;
                break;
            }
        }

        if (caseOne == true) { return sumOfBeautyOfAllNums; }

        // TODO

        // case 2: if true && case 1 is false, then, result = 1
        //   1, if nums[i - 1] < nums[i] < nums[i + 1], and the previous condition is not satisfied.
        // case 3:
        //   0, if none of the previous conditions holds.
        //
        // Return the sum of beauty of all nums[i] where 1 <= i <= nums.length - 2.

        return sumOfBeautyOfAllNums;
    }
}
