// Last updated: 8/6/2025, 11:10:23 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> l = new ArrayList<>();
        while (head != null){
            l.add(head.val);
            head = head.next;
        }
        int left = 0;
        int right = l.size() - 1;
        while (right > left && l.get(left) == l.get(right)){
            left++;
            right--;
        }
        return left >= right;
    }
}