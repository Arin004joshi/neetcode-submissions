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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode res = new ListNode(0);
        ListNode temp3 = res;
        ListNode head = res;
        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                res.next = new ListNode(temp1.val);
                res = res.next;
                temp1 = temp1.next;
            } else {
                res.next = new ListNode(temp2.val);
                res = res.next;
                temp2 = temp2.next;
            }
        }
        while (temp1 != null) {
            res.next = new ListNode(temp1.val);
            res = res.next;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            res.next = new ListNode(temp2.val);
            res = res.next;
            temp2 = temp2.next;
        }
        return head.next;
    }
}