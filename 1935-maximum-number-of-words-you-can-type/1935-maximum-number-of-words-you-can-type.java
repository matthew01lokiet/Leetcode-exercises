class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        var words = text.split(" ");
        int fullyTypeWordsSize = words.length;
        
        if(brokenLetters.equals(""))
            return fullyTypeWordsSize;
        var letters = brokenLetters.split("");
        
        for(var word : words)
            for(var letter : letters) {
                if(word.contains(letter)) {
                    fullyTypeWordsSize--;
                    break;
                }
            }
                
        return fullyTypeWordsSize;
    }
}