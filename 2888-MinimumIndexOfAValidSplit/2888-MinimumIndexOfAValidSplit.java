// Last updated: 8/6/2025, 11:04:57 AM
class Solution {
    public int minimumIndex(List<Integer> nums) {
        int count1 = 0;
        int count2 = 0;
        int index = -1;
        int dominate = findMaxFrequency(nums);
        for (int i = 0; i < nums.size(); i++){
            if (nums.get(i) == dominate){
                count1++;
            }
            else{
                count1--;
            }
            if(count1==1){
                index = i;
                break;
            }
        }
        for (int i = index + 1; i < nums.size(); i++){
            if (nums.get(i) == dominate){
                count2++;
            }
            else{
                count2--;
            }
        }
        if (count2 >= 1){
            return index;
        }
        return -1;
        
    }
    // public static int findMaxFrequency(List<Integer> arrayList) {
    //     int maxFreq = 0;
    //     int maxFreqNum = arrayList.get(0);
    //     for (int i = 0; i < arrayList.size(); i++) {
    //         int count = 0;
    //         for (int j = 0; j < arrayList.size(); j++) {
    //             if (arrayList.get(i).equals(arrayList.get(j))) {
    //                 count++;
    //             }
    //         }
    //         if (count > maxFreq) {
    //             maxFreq = count;
    //             maxFreqNum = arrayList.get(i);
    //         }
    //     }
    //     return maxFreqNum;
    // }
    public int findMaxFrequency(List<Integer> nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int maxFrequency = 0;
        int mostFrequentElement = -1;

        for (int key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) > maxFrequency) {
                maxFrequency = frequencyMap.get(key);
                mostFrequentElement = key;
            }
        }
        return mostFrequentElement;

    }
}