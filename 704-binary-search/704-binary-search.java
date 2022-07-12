class Solution {
    public int search(int[] nums, int target) {
        var left = 0;
        var right = nums.length - 1;
        
        int i;
        while(left <= right) {
            i = (left+right)/2;
            
            if(nums[i] < target)
                left = i + 1;   
            else if (nums[i] > target)
                right = i - 1;
            else
                return i;
        }
        
        return -1;
    }
}