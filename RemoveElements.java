/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode res = head;
        if (head != null && head.next == null) return res;
        while (head != null && head.next != null) {
            if (head.next.val == val) {
                head.next = head.next.next;
                continue;
            }
            head = head.next;
        }
        return res;
    }
}
