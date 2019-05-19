/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        int size = 0;
        ListNode backup = head;
        while (head != null) {
            size++;
            head = head.next;
        }
        System.out.println(size);
        int[] array = new int[size];
        int index = 0;
        head = backup;
        while (head != null) {
            array[index++] = head.val;
            head = head.next;
        }
        for (int i = 0; i < size / 2; i++) {
            if (array[i] != array[size - 1 - i]) {
                return false;
            }
        }
        return true;
        /*
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
        }
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            if (list.get(i) != list.get(size - 1 - i)) {
                return false;
            }
        }
        return true;
        */
        // ArrayList<Integer> reversed = new ArrayList<>();
        /*
        ListIterator<Integer> iter = list.listIterator(list.size());
        while (iter.hasPrevious()) {
            reversed.add(iter.previous());
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != reversed.get(i)) return false;
        }
        return true;
        */
        /*
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(String.valueOf(head.val));
            head = head.next;
        }
        String original = sb.toString();
        String reversed = sb.reverse().toString();
        if (original.equals(reversed)) return true;
        return false;
        */
    }
}
