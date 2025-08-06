// Last updated: 8/6/2025, 11:05:40 AM
class Solution {
    public int minimumCardPickup(int[] cards) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < cards.length; i++){
            // if key found check for min
            if (map.containsKey(cards[i])){
                int index = map.get(cards[i]);
                ans = Math.min(ans,i - index +1);
            }
            map.put(cards[i] ,i); // putting the value in hash map taking key as cards[i]
        }
        
        return ans == Integer.MAX_VALUE ? -1 : ans ; 
    }
}