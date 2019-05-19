/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } 
        if (l2 == null) {
            return l1;
        }
        ListNode prev = null;
        ListNode head = null;
        ListNode node = null;
        while(l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                if (prev == null) {
                    prev = new ListNode(l1.val);
                    System.out.println(prev.val);
                    head = prev;
                } else {
                    node = new ListNode(l1.val);
                    prev.next = node;
                    prev = node;
                    System.out.println(node.val);
                }
                l1 = l1.next;
            } else {
                if (prev == null) {
                    prev = new ListNode(l2.val);
                    System.out.println(prev.val);
                    head = prev;
                } else {
                    node = new ListNode(l2.val);
                    prev.next = node;
                    prev = node;
                    System.out.println(node.val);
                }
                l2 = l2.next;
            }
            // prev.next = node;
            // prev = node;
            // l1 = l1.next;
            // l2 = l2.next;
        }
        if (l1 == null) {
            prev.next = l2;
        } else if (l2 == null) {
            prev.next = l1;
        }
        return head;
    }
}
