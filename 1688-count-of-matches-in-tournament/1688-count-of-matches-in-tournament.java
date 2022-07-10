class Solution {
    public int numberOfMatches(int n) {
        if(n == 1) {
            return 0;
        }
        
        if(n == 2) {
            return 1;
        }
        
        if(n % 2 == 0) {
            var num = n >> 1;
            return num + numberOfMatches(num);
        }
        
        var num = (n - 1) >> 1;
        return num + numberOfMatches(num + 1);
    }
}