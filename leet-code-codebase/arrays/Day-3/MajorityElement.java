class MajorityElement {
    public int majorityElement(int[] nums) {
        int freq = 0 , res = 0;

        for(int i=0; i<nums.length; i++){
            if(freq == 0){
                res = nums[i];
            }

            if(res == nums[i]){
                freq++;
            }else{
                freq--;
            }
        }
        return res;
    }
}