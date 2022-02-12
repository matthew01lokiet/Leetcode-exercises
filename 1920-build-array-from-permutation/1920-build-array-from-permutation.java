/*
    Time Complexity:  O(2n)
    Space Complexity: O(1)
*/
class Solution {
    
    public int[] buildArray(int[] nums) {
        
        for(int i = 0; i < nums.length; i++)
            nums[i] |= ((nums[nums[i]] & 1023) << 10);
        
        for(int i = 0; i < nums.length; i++)
            nums[i] >>= 10;
        
        return nums;
    }
}

/*
    Bit manipulation approach.
    
    The solution is based on the given facts:
        - The biggest number in the array cell cannot be larger than the array greatest length (1000)
        - 1000 written in binary occupies 10 bits
        - Size of integer cell in array is 32 bits (31 bits free because 2's complement)
        - So in reality you can encode even 3 numbers in one integer array cell (taking into consideration 1000 number size constraint)
        - At first iteration we encode new value into old value cell, keeping them together (and when it needs to be used, we decode it)
        - At second iteration we get rid of old values
*/

