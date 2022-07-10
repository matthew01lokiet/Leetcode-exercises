class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        var disSet = IntStream
            .rangeClosed(1, nums.length)
            .boxed()
            .collect(Collectors.toSet());
        
        for(int i = 0; i < nums.length; i++) {
            disSet.remove(nums[i]);
        }
        
        return new ArrayList<Integer>(disSet);
    }
}