// Last updated: 8/6/2025, 11:12:51 AM
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int current_area = Integer.MAX_VALUE;
        int max_area = Integer.MIN_VALUE;

        while (left < right){
            current_area = (Math.min(height[left], height[right])) * (right - left);
            max_area = Math.max(max_area,current_area);

            if (height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max_area;
    }
}