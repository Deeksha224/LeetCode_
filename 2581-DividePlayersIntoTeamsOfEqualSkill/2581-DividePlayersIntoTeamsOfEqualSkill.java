// Last updated: 8/6/2025, 11:05:13 AM
class Solution {
    public long dividePlayers(int[] skill) {
       Arrays.sort(skill);
       long sum = 0;
       int left = 0;
       int right = skill.length - 1;
       int ski = skill[0] + skill[skill.length - 1];
       while (left < right){
            long pro = 1;
            if (skill[left] + skill[right] == ski){
                pro = skill[left] * skill[right];
                sum += pro;
            }
            else{
                return -1;
            }
            left++;
            right--;
            
        } 
        return sum==0?-1:sum;
    }
}