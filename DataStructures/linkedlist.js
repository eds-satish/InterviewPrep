function LinkedList() {
	this.head = null;
}

LinkedList.prototype.add = function(val){
	var node = {
		value: val,
		next: null
	};

	
	if(!this.head){
		this.head = node;
	}
	else{
		var current = this.head; 
		while(current.next){ //pointer to following node 
			current = current.next; 
		}
		current.next = node; //moving the pointer to the new node 
	}
};


/* Remove linked list from the list 

1. If node is your head node.
2. If node is your tail node.
3. If node is in the middle. 
*/

LinkedList.prototype.delete = function(val) {
	var current = this.head;
	//1
	if(current.val == val){
		this.head = current.next; //moves location to next node
	}
	else {
		var previous = current; 

		while(current.next){
			//3
			if(current.value == val){
				previous.next = current.next; //pointer moving
				break;
			}
			previous = current;
			current = current.next;
		}
		//2
		if(current.val == val){
			previous.next = null;
		}
	}
}; 




var sll = new LinkedList();
sll.add(2);
sll.add('alex');
sll.add('liz');

// console.log(sll.head);
// console.log(sll.head.next);
// console.log(sll.head.next.next);

sll.delete(2);
console.log(sll.head);
sll.delete('liz');
console.log(sll.head);






