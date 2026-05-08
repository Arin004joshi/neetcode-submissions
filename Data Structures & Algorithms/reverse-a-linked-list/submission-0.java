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
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        Integer[] arr = list.toArray(new Integer[0]);
        int[] rev = new int[arr.length];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            rev[i] = arr[n - i - 1];
        }
        ListNode newNode = new ListNode(rev[0]);
        ListNode curr = newNode;
        for (int j = 1; j < n; j++) {
            curr.next = new ListNode(rev[j]);
            curr = curr.next;
        }
        return newNode;
    }
}
