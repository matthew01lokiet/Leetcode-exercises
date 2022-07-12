class Solution {
    public int maxProductDifference(int[] nums) {
       int[] arrDesc = Arrays.stream(nums).boxed()
            .sorted(Collections.reverseOrder())
            .mapToInt(Integer::intValue)
            .toArray();
        
        return (arrDesc[0]*arrDesc[1]) - (arrDesc[nums.length-1]*arrDesc[nums.length-2]);
    }
}