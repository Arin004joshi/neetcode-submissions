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
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set = new HashSet<>();
        ListNode cur = head;
        while (cur != null) {
            set.add(cur.val);
            cur = cur.next;
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        ListNode res = new ListNode();
        ListNode curr = res;
        for (int x : list) {
            curr.next = new ListNode(x);
            curr = curr.next;
        }
        return res.next;
    }
}