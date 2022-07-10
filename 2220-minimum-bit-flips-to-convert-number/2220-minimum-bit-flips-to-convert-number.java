class Solution {
    public int minBitFlips(int start, int goal) {
        final var flips = start ^ goal;
        final var binStr = Integer.toBinaryString(flips);
        
        return (int)binStr.chars().filter(ch -> ch == '1').count();
    }
}