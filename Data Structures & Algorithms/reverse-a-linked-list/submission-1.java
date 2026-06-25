/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val;this.next = null }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null){return null;}
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }
        Integer[] arr = list.toArray(new Integer[list.size()]);
        int[] rev = new int[arr.length];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            rev[i] = arr[n - 1 - i];
        }
        ListNode newNode = new ListNode(rev[0]);
        ListNode temp = newNode;
        for (int j= 1; j < rev.length; j++) {
            temp.next = new ListNode(rev[j]);
            temp = temp.next;
        }
        return newNode;
    }
}
