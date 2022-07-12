class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(var pattern : patterns)
            if(word.contains(pattern))
                count++;
        
        return count;
    }   
}