// Last updated: 8/6/2025, 11:08:08 AM
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int j = people.length - 1;
        int i = 0;
        int count = 0;
        Arrays.sort(people);
        while (i <= j){
            if (people[i] + people[j] <= limit){
                i++;
            }
            j--;
            count++;
        }
        return count;
    }
}