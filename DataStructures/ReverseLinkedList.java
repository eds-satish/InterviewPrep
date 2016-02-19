
class LinkedList {
 
    static Node head;
 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
 
    /* Function to reverse the linked list */
    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next; //keep track of next location
            current.next = prev; //reverse pointer
            prev = current; //tranverses through linked list
            current = next; //tranverses through linked list
        }
        node = prev; //make it the head
        return node;
    }
 
    // prints content of double linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }


    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/*public class Solution {
    public ListNode reverseList(ListNode head) {
        //if the head is null
        if(head == null) return head;
        
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        
        while(curr != null){
            next = curr.next; //get location of next node
            curr.next = prev; //point pointer to prev's node
            prev = curr; //iterate through
            curr = next; //for both
        }
        head = prev;
        return head;
    }
}*/