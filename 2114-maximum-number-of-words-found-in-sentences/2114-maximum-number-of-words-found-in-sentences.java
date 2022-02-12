/*
    n - number of chars
    Time Complexity:  O(n)
    Space Complexity: O(1)
*/
class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int maxWords = 0;
        int currentWords = 1;
        
        for(String sent : sentences){
            
            for(int i = 0; i < sent.length(); i++){
                
                if(sent.charAt(i) == ' ')
                    currentWords++;
            }
            
            if(maxWords < currentWords)
                maxWords = currentWords;
            
            currentWords = 1;
        }
        
        return maxWords;
    }
}