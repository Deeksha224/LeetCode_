// Last updated: 8/6/2025, 11:07:03 AM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count = numBottles;
        while (numBottles >= numExchange){
            int a = numBottles / numExchange;
            count = a + count;
            numBottles = (numBottles % numExchange) + a;
        }
        return count;
    }
}