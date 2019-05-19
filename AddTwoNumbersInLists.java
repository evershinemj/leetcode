/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String s1 = "";
        String s2 = "";
        while (l1 != null) {
            s1 += l1.val;
        }
        while (l2 != null) {
            s2 += l2.val;
        }
//        long long1 = (long) Integer.parseInt(s1);
//        long long2 = (long) Integer.parseInt(s2);
        long long1 = Long.parseLong(s1);
        long long2 = Long.parseLong(s2);
        long sum = long1 + long2;
        String sumString = String.valueOf(sum);
        ListNode head = new ListNode(sumString.charAt(0) - '0');
        ListNode res = head;
        for (int i = 1; i < sumString.length(); i++) {
            head.next = new ListNode(sumString.charAt(i) - '0');
            head = head.next;
        }
        return res;
    }
}
