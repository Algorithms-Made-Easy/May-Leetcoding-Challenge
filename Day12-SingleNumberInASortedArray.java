class Day12-SingleNumberInASortedArray {
    public int singleNonDuplicate(int[] nums) {
        
        if(nums.length == 1)
            return nums[0];
        
        for(int i=0; i<=nums.length/2; i=i+2) {
            if(nums[i]!=nums[i+1])
                return nums[i];
            
            if(nums[nums.length-1-i]!=nums[nums.length-2-i])
                return nums[nums.length-1-i];
        }
        
        return -1;
    }
}