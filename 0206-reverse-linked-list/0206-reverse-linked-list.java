/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode reverse = null;

        ListNode current = head;
        // 1

        // 1,2
        while(current !=null)
        {
            ListNode next = current.next;
            //2
            current.next = reverse;
            reverse = current;
            current = next;

        }

        return reverse;
        
    }
}