// Last updated: 8/6/2025, 11:06:24 AM
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        if (n%2==0){
            for (int i = 0; i < (n/2); i++){
                l1.add(nums[i]);
            }
            for (int i = (n/2); i < nums.length; i++){
                l2.add(nums[i]);
            }
        }
        else{
            for (int i = 0; i < (n/2)+1; i++){
                l1.add(nums[i]);
            }
            for (int i = (n/2)+1; i < nums.length; i++){
                l2.add(nums[i]);
            }
        }
        
        Collections.reverse(l1);
        Collections.reverse(l2);

        int a = 0;
        int i = 0;
        while(i < nums.length && a < l1.size() ){
            nums[i] = l1.get(a);
            a++;
            i+=2;
        }
        int b = 0;
        int j = 1;
        while(j < nums.length && b < l2.size() ){
            nums[j] = l2.get(b);
            b++;
            j+=2;
        }
        return nums;
    }
}