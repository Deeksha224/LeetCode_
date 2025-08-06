// Last updated: 8/6/2025, 11:07:36 AM
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
    public int getDecimalValue(ListNode head) {
        int result = head.val;
        while (head.next != null){
            result = (result << 1) | head.next.val;
            head = head.next; 
        }
        return result;
    }
}