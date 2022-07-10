public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        return (int)Integer.toBinaryString(n).chars().filter(ch -> ch == '1').count();
    }
}