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
        List<ListNode> temp = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            temp.add(cur);
            cur = cur.next;
        }
        int index_to_del = temp.size()-n;
        if(index_to_del==0){
            return head.next;
        }else{
            temp.get(index_to_del-1).next = temp.get(index_to_del).next;
        }
        return head;
    }
}