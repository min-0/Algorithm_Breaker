import java.math.BigInteger;

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode answer = l3;
        StringBuilder str1 = new StringBuilder(), str2 = new StringBuilder();
        
        while (l1 != null) {
            str1.append(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            str2.append(l2.val);
            l2 = l2.next;
        }

        BigInteger num1 = new BigInteger(str1.reverse().toString());
        BigInteger num2 = new BigInteger(str2.reverse().toString());
        BigInteger sum = num1.add(num2);
        String temp = new StringBuilder(sum.toString()).reverse().toString();
        intToList(temp, l3);
        
        return answer.next;
    }

    static void intToList(String temp, ListNode l3) {
        for (int i = 0; i < temp.length(); i++) {
            int digit = Character.getNumericValue(temp.charAt(i));
            l3.next = new ListNode(digit);
            l3 = l3.next;
        }
    }
}
