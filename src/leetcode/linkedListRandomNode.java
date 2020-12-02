/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

class ListNode {

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

class Solution {

    //declare a listNode 
    ListNode head;

    /**
     * @param head The linked list's head. Note that the head is guaranteed to
     * be not null, so it contains at least one node.
     */
    public Solution(ListNode head) {
        //head is assigned when the constructor is called
        this.head = head;
    }

    /**
     * Returns a random node's value.
     */
    public int getRandom() {
        //count the length of linked list
        ListNode curr = this.head;
        int n = 1;
        while (curr.next != null) {
            curr = curr.next;
            n++;
        }

        //generate random (0-1) multiply by n (size of linked list)
        curr = this.head;
        int rand = (int) (Math.random() * n);
        for (int i = 0; i < rand; i++) {
            curr = curr.next;
        }
        return curr.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such: Solution obj =
 * new Solution(head); int param_1 = obj.getRandom();
 */
