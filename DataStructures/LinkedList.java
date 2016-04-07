class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x;}
}


public class LinkedList {
    public static void main(String[] args){
        ListNode node = new ListNode(4);
        node.next = new ListNode(3);
        node.next.next = new ListNode(7);
        System.out.println(reverseLinkedList(node));
    }
    //reverse LinkedList
    public static ListNode reverseLinkedList(ListNode node){
        if(node == null) throw new IllegalArgumentException("Head is null");

        ListNode prev = null;
        ListNode curr = node;
        ListNode next = null;

        while(curr != null){
            next = curr.next; //save temp location
            curr.next = prev; //reverse pointer
            prev = curr; //iterate through list
            curr = next; //iterate through list
        }
        node = prev; //set head
        return node;
    }

    //detect a cycle in Linked List
    //Big O - O(n+n = 2n = n)
    public static boolean detectCycle(ListNode head){
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        if(head == null || head.next == null) return false;

        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            if(fastPtr == slowPtr) return true; //has met up with it
        }
        return false; 
    }

    //Remove all elements from value provided 
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) throw new IllegalArgumentException("head is null");

        while(head.val == val){ //if the head has the value 
            head = head.next; //skips
            if(head == null) return head;
        }

        ListNode prev = head;
        while(prev.next != null){
            if(prev.next.val == val) prev.next = prev.next.next; //removes it 
            else prev = prev.next; //iterate through 
        }
        return head;
    }
    //Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
    public void deleteNode(ListNode node){
        if(node == null || node.next == null) throw new IllegalArgumentException("null error!");

        ListNode nextNode = node.next;
        node.val = nextNode.val; //replaces value
        node.next = nextNode.next;
    }
    //Find middle element of LinkedList
    public static ListNode findMiddle(ListNode head){
        ListNode curr = head;
        ListNode middle = head;

        int len = 0;
        while(curr.next != null){
            len++;
            if(len % 2 == 0) middle = middle.next;
            curr = curr.next;
        }
        if(len % 2 == 1) middle = middle.next;
        return middle;
    }
    //find the length of a singly linked list - iterative
    public static int iterativeFindLen(ListNode node){
        ListNode curr = node;

        int len = 0;
        while(curr.next != null){
            len++;
            curr = curr.next;
        }
        return len;
    }

    public static int recursiveFindLen(ListNode node){
        //base case
        if(node == null) return 0;

        return 1 + recursiveFindLen(node.next);
    }

   


    //delete node in the middle of a linked list 
    public boolean deleteMiddleNode(ListNode middleNode){ //n
        if(middleNode == null || middleNode.next == null) return false;

        //have to infer we dont have access to head
        middleNode.val = middleNode.next.val; //replaces the value
        ListNode temp = middleNode.next;
        middleNode.next = temp.next; //skips over 
        return true;
    }

    //Remove Nth Node from end of list
    public ListNode removeNthNode(ListNode head, int n){
        if(head == null) return null;

        //using 2 pointers in order to know where to remove nth node
        ListNode slow = head;
        ListNode fast = head;

        for(int i = 0; i < n;++i){
            fast = fast.next; //moving fast ptr to last element or null for edge case
        }

        if(fast == null){
            head = head.next;
            return head;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next; //skips the nth element you need to remove
        return head;

    }





 

}
