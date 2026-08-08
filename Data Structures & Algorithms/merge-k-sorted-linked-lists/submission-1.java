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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer>temp = new ArrayList<>();
        for(ListNode item : lists){
            while(item!=null){
                temp.add(item.val);
                item=item.next;
            }
        }
        Collections.sort(temp);
        ListNode node = new ListNode(0);
        ListNode curr = node;
        for(int data:temp){
            curr.next = new ListNode(data);
            curr = curr.next;
        }
        return node.next;
    }
}
