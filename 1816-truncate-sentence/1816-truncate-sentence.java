class Solution {
    public String truncateSentence(String s, int k) {
        return Stream.of(s.split(" ")).limit(k).collect(Collectors.joining(" "));
    }
}