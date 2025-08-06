// Last updated: 8/6/2025, 11:09:42 AM
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList <Integer> arr = new ArrayList <> ();
        for (int i = 0; i < nums1.length; i++){
            for (int j = 0; j < nums2.length; j++){
                if (nums1[i] == nums2[j]){
                    arr.add (nums1[i]);
                    nums2[j] = -1;
                    break;
                }
            }
        }
        int size = arr.size();
        int[] arr1 = new int[size];
        for (int i = 0; i < size; i++){
            arr1[i] = arr.get(i);
        }
        return arr1;
    }
}