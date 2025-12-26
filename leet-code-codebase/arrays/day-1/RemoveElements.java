class RemoveElements {
    public int removeElement(int[] nums, int val) {
        int k =0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]!=val){
                nums[k] = nmums[i];
                k++;
            }
        }
        return k;
    }
}