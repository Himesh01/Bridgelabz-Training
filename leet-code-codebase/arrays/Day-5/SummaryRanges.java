/*
You are given a sorted unique integer array nums.
A range [a,b] is the set of all integers from a to b (inclusive).
Return the smallest sorted list of ranges that cover all the numbers in the array exactly.
 That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.
Each range [a,b] in the list should be output as:
"a->b" if a != b
"a" if a == b
*/

class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums.length == 0){
            return result;
        }
        int start = nums[0];

        for(int i=1; i<=nums.length; i++){
            if(i==nums.length || nums[i]!=nums[i-1]+1){
                if(start == nums[i-1]){
                    result.add(start+"");
                } else {
                    result.add(start + "->" + nums[i-1]);
                }
                if(i < nums.length){
                    start = nums[i];
                }
            }
        }
        return result;
    }
}