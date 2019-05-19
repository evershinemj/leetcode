/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        if (head.next == null) return head;
        // for lists with at least two nodes
        // for each step:
        // make the last node point to the head
        // and the last but one node point to null
        ListNode current = head;
        ListNode cursor = head;
        int size = 0;
        // speed can be improved as patterns are repeated
//        for (int i = 0; i < k; i++) {
        // first figure out the size of the list
        while (cursor != null) {
            size++;
            cursor = cursor.next;
        }
        for (int i = 0; i < k % size; i++) {
//            while (head.next != null) {
//            while (head.next.next != null) {
            while (current.next.next != null) {
//                head = head.next;
                current = current.next;
            }
            ListNode lastButOne = current;
            ListNode last = current.next;
            last.next = head;
            lastButOne.next = null;
            head = last;
            current = head;
        }
        return head;
    }
}
