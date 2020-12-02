/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author User
 */
public class mergeInBetween {

    public class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        //find node before a 
        ListNode curr = list1;
        for (int i = 1; i < a; i++) {
            curr = curr.next;
        }
        
        //find node after b
        ListNode ltr = list1;
        for (int i = 0; i <= b; i++) {
            ltr = ltr.next;
        }
        
        //link a to list2
        curr.next = list2;
        
        //find end node of list2
        ListNode temp = list2;
        while (temp.next != null) {
            temp = temp.next;
        }
        
        //link end node of list2 to node after b
        temp.next = ltr;
        return list1;
    }
}
