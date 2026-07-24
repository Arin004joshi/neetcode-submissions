/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        Node cur = head;
        while (cur != null) {
            Node newNode = new Node(cur.val);
            map.put(cur, newNode);
            cur = (cur != null) ? cur.next : null;
        }
        for (Map.Entry<Node, Node> entry : map.entrySet()) {
            Node copy = entry.getValue();
            Node org = entry.getKey();
            copy.next = map.get(org.next);
            copy.random = map.get(org.random);
        }
        return map.get(head);
    }
}