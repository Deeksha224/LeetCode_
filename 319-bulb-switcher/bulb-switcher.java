class Solution {
    public int bulbSwitch(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(checkSquare(i)) count++;
        }
        return count;
        
    }
    public boolean checkSquare(int n){
        if(n >= 0){
            long sq = (long)Math.sqrt(n);
            return (sq*sq == n);
        }
        return false;

    }
}