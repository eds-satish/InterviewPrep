import java.util*;

//1->1->2, return 1->2

public class findDuplicateLinkedList{

	public ListNode deleteDuplicate(ListNode head){
		if(head == null || head.next == null){
			return head;
		}
		ListNode prev = head;
		ListNode p = head.next;

		while(p != null){
			if(prev.val == p.val){
				prev.next = p.next; //moves the pointer of head to point to new next node
				p = p.next;  //changes location

			}
			else{
				prev = p; //moves previous node to next node's location
				p = p.next;  //moves next node's location to the pointer location of next node
			}
		}
		return head;

	}



	
	
}