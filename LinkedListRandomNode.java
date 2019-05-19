/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    private ListNode head = null;

    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head) {
        this.head = head;
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        ListNode original = head;
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        head = original;
        int[] arr = new int[size];
        int index = 0;
        while (head != null) {
            arr[index++] = head.val;
            head = head.next;
        }
        head = original;
        Random random = new Random();
        return arr[random.nextInt(size)];
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
