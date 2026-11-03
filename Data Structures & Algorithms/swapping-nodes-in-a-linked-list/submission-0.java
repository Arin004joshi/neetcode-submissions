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
    public ListNode swapNodes(ListNode head, int k) {
        List<ListNode>list = new ArrayList<>();
        ListNode cur = head;
        while(cur!=null){
            list.add(cur);
            cur = cur.next;
        }
        swap(list.get(k-1),list.get(list.size()-k));
        return head;
    }
    public void swap(ListNode l1, ListNode l2) {
        int temp = l1.val;
        l1.val = l2.val;
        l2.val = temp;
    }
}