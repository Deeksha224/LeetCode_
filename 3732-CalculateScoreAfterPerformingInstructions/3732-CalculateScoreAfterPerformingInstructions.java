// Last updated: 8/6/2025, 11:04:23 AM
class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        long score = 0;
        int i = 0;
        int n = values.length;
        while ( i >= 0 && i < n && !instructions[i].equals(".")){
            if (instructions[i].equals("add")){
                score += values[i];
                instructions[i] = ".";
                i++;  
            }
            else{
                instructions[i] = ".";
                i = i + values[i];
            }
        }
        return score;
    }
}