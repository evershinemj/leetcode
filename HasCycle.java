/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();
        while (head.next != null) {
            list.add(head);
            head = head.next;
        }
        for (ListNode node : list) {
            if (head == node) {
                return true;
            }
        }
        return false;
    }
}
