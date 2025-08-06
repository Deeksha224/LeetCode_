// Last updated: 8/6/2025, 11:11:08 AM
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode Fast = head;
        while (Fast!= null && Fast.next != null){
            slow = slow.next;
            Fast = Fast.next.next;
            if (slow == Fast){
                return true;
            }
        }
        return false;
    }
}