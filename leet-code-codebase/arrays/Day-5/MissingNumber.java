/*
268. Missing Number
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
*/

class MissingNumber {
    public int missingNumber(int[] nums) {
        int Sum=0;
        int arrSum=0;

        for(int i=1; i<=nums.length; i++){
            Sum = Sum + i;
        }

        for(int i=0; i<nums.length; i++){
            arrSum = arrSum + nums[i];
        }

        int result = Sum - arrSum;
        return result;
    }
}