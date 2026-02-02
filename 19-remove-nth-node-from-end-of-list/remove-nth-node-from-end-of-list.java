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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp1 = head;
        for (int i = 1; i < n; i++){
            temp1 = temp1.next;
        }
        ListNode temp2 = new ListNode(0);
        temp2.next = head;
        ListNode temp = temp2;
        if(temp1.next==null) return head.next;
        while (temp1 != null && temp1.next != null){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        if(temp2.next != null){
            temp2.next = temp2.next.next;
        }
        return temp.next;
    }
}