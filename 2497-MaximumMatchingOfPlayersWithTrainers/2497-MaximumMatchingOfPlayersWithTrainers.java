// Last updated: 8/6/2025, 11:05:25 AM
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int i = 0; 
        int j = 0;
        int count = 0;

        while (i < players.length && j < trainers.length){
            if (players[i] <= trainers[j]){
                count ++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return count;
    }
}