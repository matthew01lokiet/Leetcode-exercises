class Solution {
    public int distributeCandies(int[] candyType) {
        
        List<Integer> candies = Arrays.stream(candyType).boxed().collect(Collectors.toList());
        
        Set<Integer> candyTypes = new HashSet<>(candies);
        
        final int[] n = {candyType.length/2};
        
        final int[] diffTypes = {0};
        
        candyTypes.forEach(k ->{
            
            if(diffTypes[0] == candyTypes.size() || diffTypes[0] == n[0])
                return;
            
            diffTypes[0]++;
            
        });
        
        return diffTypes[0];
        
    }
}