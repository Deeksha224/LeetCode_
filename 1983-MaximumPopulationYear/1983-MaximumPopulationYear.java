// Last updated: 8/6/2025, 11:06:34 AM
class Solution {
    public int maximumPopulation(int[][] logs) {
        int count = 0;
        int max = 0;
        int year = 0;
        for(int i = 0; i < logs.length; i++){
            int x = logs[i][0];
            for (int j = 0; j < logs.length; j++){
                if (x >= logs[j][0] && x < logs[j][1]){
                    count++;
                } 
                // int [] arr = new int[xx]
            }
            if (max == count){
                if (x < year){
                    year = x;
                }
            }
            else if (max <= count){
                        max = count;
                        year = x;
                    }
            count  = 0;
        }    
        return year;
    }
}