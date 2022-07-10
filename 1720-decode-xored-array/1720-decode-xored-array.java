class Solution {
    public int[] decode(int[] encoded, int first) {
        int size = encoded.length + 1;
        var arr = new int[size];
        arr[0] = first;
        
        for(int i = 1; i < size; i++) {
            arr[i] = arr[i-1] ^ encoded[i-1];
        }
        
        return arr;
    }
}