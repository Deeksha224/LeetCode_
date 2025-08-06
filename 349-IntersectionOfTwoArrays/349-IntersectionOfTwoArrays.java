// Last updated: 8/6/2025, 11:09:44 AM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList <Integer> arr = new ArrayList <> ();
        for (int i = 0; i < nums1.length; i++){
            for (int j = 0; j < nums2.length; j++){
                if (nums1[i] == nums2[j]){
                    arr.add (nums1[i]);
                    nums2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
        Set<Integer> arr2 = new LinkedHashSet<>(arr);
        int size = arr2.size();
        int[] arr1 = new int[size];
        int i = 0;
        for (Integer num : arr2){ //Using an enhanced for loop to correctly transfer unique elements from the LinkedHashSet to the array.
            arr1[i++] = num;
        }
        return arr1;
    }
}