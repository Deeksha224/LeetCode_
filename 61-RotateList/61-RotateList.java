// Last updated: 8/6/2025, 11:11:48 AM
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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        int size = 1;
        if (head == null || head.next == null){
            return head;
        }
        while (temp != null && temp.next != null){
            size++;
            temp = temp.next;
        }
        temp.next = head; 
        k = k % size;
        k = size - k;
        temp = head;
        for (int i = 1; i < k; i++){
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
}