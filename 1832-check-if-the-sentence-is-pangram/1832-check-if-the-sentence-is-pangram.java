class Solution {
    public boolean checkIfPangram(String sentence) {
        var arr = new int[123];
        
        for(var chara : sentence.toCharArray())
            arr[(int)chara] = 1;
        
        for(int i = 97; i < 123; i++)
            if(arr[i] == 0)
                return false;
        
        return true;
    }
}