/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode toReturn = head;
        /*
        if (head == null || head.next == null) {
//            return head;
            return toReturn;
        }
        */
        // while (head.next.next != null) {
        while (head !=null && head.next != null) {

            if (head.val == head.next.val) {
                head.next = head.next.next;
                // head = head.next;
               // deleteDuplicates(head);
            } else {
                head = head.next;
               // deleteDuplicates(head);
            }
            // if (head == null || head.next == null) {
            if (head.next == null) {
                return toReturn;
            }
           // deleteDuplicates(head);
//        return head;
        }
        return toReturn;
    }
}

/**
 *  class Solution {
 *      public ListNode deleteDuplicates(ListNode head) {
 *          ListNode toReturn = head;
 *          if (head == null || head.next == null) {
 *  //            return head;
 *              return toReturn;
 *          }
 *          // while (head.next.next != null) {
 *          while (head !=null && head.next != null) {
 *              if (head.val == head.next.val) {
 *                  head.next = head.next.next;
 *                  // head = head.next;
 *                  // shouldn't advance head here, as there could be
 *                  // more than two duplicates
 *                  // advance only when head.value != head.next.val
 *                  //
 *                  /**
 *                   *  deleteDuplicates(head);
 *                   *\/
 *              } else {
 *                  head = head.next;
 *                  /**
 *                   *  deleteDuplicates(head);
 *                   *\/
 *              }
 *              deleteDuplicates(head);
 *  //        return head;
 *          }
 *          return toReturn;
 *      }
 *      }
 */
