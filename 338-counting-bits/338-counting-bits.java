class Solution {
    public int[] countBits(int n) {
        var arr = new int[n+1];
        
        int count = 0;
        for(int i = 0; i < n + 1; i++) {
            for(int j = 0; j < 32; j++)
                count += (i >>> j) & 1;
            arr[i] = count;
            count = 0;
        }
        
        return arr;
    }
}