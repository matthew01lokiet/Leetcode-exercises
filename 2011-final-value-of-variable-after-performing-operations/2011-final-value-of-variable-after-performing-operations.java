/*
    Time Complexity:  O(n)
    Space Complexity: O(1)
*/
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        int init = 0;
        
        for(String op : operations)
            if(op.charAt(1) == '+')
                init++;
            else
                init--;
        
        return init;
    }
}