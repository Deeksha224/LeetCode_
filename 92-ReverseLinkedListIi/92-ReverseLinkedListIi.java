// Last updated: 8/6/2025, 11:11:23 AM
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right){
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; i < left - 1; i++){
            prev = current;
            current = current.next;
        }
        ListNode last = prev;
        ListNode newEnd = current;

        // reverse
        ListNode next = current.next;
        for (int i = 0; i < right-left+1; i++){
            current.next = prev;
            prev = current;
            current = next;
            if (next != null){
                next = next.next;
            }
        }
        if (last != null){
            last.next = prev;
        }
        else{
            head = prev;
        }
        newEnd.next = current;
        return head;
    }
}