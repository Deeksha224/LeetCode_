// Last updated: 8/6/2025, 11:04:18 AM
class Solution {
    public int maxDifference(String s) {
        int [] freq = new int[26];
		for (int i = 0; i < s.length(); i++){
		    freq[s.charAt(i) - 'a']++;
		}
		
		int maxodd = 0;
		int mineven = Integer.MAX_VALUE;
		
		for (int i = 0; i < freq.length; i++){
		    if (freq[i] > 0){
		        if (freq[i] % 2 == 0){
		            if (freq [i] < mineven){
		                mineven = freq[i];
		            }
		        }
		        else{
		            if (freq[i] > maxodd){
		                maxodd = freq[i];
		            }
		        }
		    }
		}
		return(maxodd - mineven);
    }
}