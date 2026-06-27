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
        ListNode head1 = list1;
        ListNode head2 = list2;
        if (head1 == null) {
            return head2;
        }

        if (head2 == null) {
            return head1;
        }
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        List<Integer> listArr1 = new ArrayList<>();
        List<Integer> listArr2 = new ArrayList<>();
        while (temp1 != null) {
            listArr1.add(temp1.val);
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            listArr2.add(temp2.val);
            temp2 = temp2.next;
        }

        Integer[] arr1 = listArr1.toArray(new Integer[0]);
        Integer[] arr2 = listArr2.toArray(new Integer[0]);
        int n = arr1.length;
        int m = arr2.length;
        int l = n + m;
        int[] res = new int[l];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                res[k++] = arr1[i++];
            } else {
                res[k++] = arr2[j++];
            }
        }
        while (i < n) {
            res[k++] = arr1[i++];
        }
        while (j < m) {
            res[k++] = arr2[j++];
        }
        ListNode newList = new ListNode(res[0]);
        ListNode temp = newList;
        for (int g = 1; g < res.length; g++) {
            temp.next = new ListNode(res[g]);
            temp = temp.next;
        }
        return newList;
    }
}