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
            l1 = l1.next;
        }
        while (l2 != null) {
            s2 += l2.val;
            l2 = l2.next;
        }
        // System.out.println("s1: " + s1 + "; s2: " + s2);
//        long long1 = (long) Integer.parseInt(s1);
//        long long2 = (long) Integer.parseInt(s2);
        /*
        long long1 = Long.parseLong(s1);
        long long2 = Long.parseLong(s2);
        long sum = long1 + long2;
        String sumString = String.valueOf(sum);
        */
        int addOne = 0;
        int length1 = s1.length();
        int length2 = s2.length();
        int length = Math.max(length1, length2);
        if (length1 > length2) {
            int diff = length - length2;
            String s = "";
            for (int i = 0; i < diff; i++) {
                s += "0";
            }
            s2 = s + s2;
        } else if (length2 > length1) {
            int diff = length - length1;
            String s = "";
            for (int i = 0; i < diff; i++) {
                s += "0";
            }
            s1 = s + s1;
        }
        StringBuilder sb = new StringBuilder("");
        for (int i = length - 1; i >= 0; i--) {
            int lastDigit = s1.charAt(i) - '0' + s2.charAt(i) - '0' + addOne;
            if (lastDigit < 10) {
                addOne = 0;
                sb.insert(0, String.valueOf(lastDigit));
            } else {
                addOne = 1;
                sb.insert(0, String.valueOf(lastDigit - 10));
            }
        }
        if (addOne == 1) sb.insert(0, "1");
        String sumString = sb.toString();
        ListNode head = new ListNode(sumString.charAt(0) - '0');
        ListNode res = head;
        for (int i = 1; i < sumString.length(); i++) {
            head.next = new ListNode(sumString.charAt(i) - '0');
            head = head.next;
        }
        return res;
    }
}
