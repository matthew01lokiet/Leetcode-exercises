class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int size = items.size();
        
        for(int i = 0; i < items.size(); i++) {
            if(ruleKey.equals("type") && !items.get(i).get(0).equals(ruleValue)) {
                size--;
                continue;
            }  
            if(ruleKey.equals("color") && !items.get(i).get(1).equals(ruleValue)) {
                size--;
                continue;
            }
            if(ruleKey.equals("name") && !items.get(i).get(2).equals(ruleValue))
                size--;
        }
        
        return size;
    }    
}