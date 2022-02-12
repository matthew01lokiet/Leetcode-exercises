/*
    Time Complexity:  O(n)
    Space Complexity: O(2n)
*/
class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int[] arr = new int[nums.length*2];
        
        for(int i=0; i < nums.length; i++)
            arr[i+nums.length] = arr[i] = nums[i];
        
        return arr;
    }
}