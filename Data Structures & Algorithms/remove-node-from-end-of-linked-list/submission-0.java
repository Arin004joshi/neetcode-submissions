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
        List<ListNode> list = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            list.add(curr);
            curr = curr.next;
        }
        int index_to_del = list.size() - n;
        int i = 0;
        ListNode temp = list.get(i);
        if (index_to_del == 0) {
            return head.next;
        } else {
            list.get(index_to_del - 1).next = list.get(index_to_del).next;
        }
        return head;
    }
}