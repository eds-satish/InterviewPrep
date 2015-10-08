var num = 10,
	name = "Jane Austen",

	obj1 = {
		state: "unchanged"
	},

	obj2 = {
		state: "unchanged"
	},

	obj3 = obj2;

	function change(num,name,obj1,obj2){
		num = num * 10;
		name = "Nathaniel Hawthorne";
		console.log("first change" + obj2.state);
		obj1 = obj2;
		obj2.state = "changed"; //prototype causes change and change to obj1 if callled inside

		console.log("num = " + num); //100
		console.log("name = " + name); //Nathaniel Hawthorne changes assign value 
		console.log("obj1.state = " + obj1.state); //unchanged becomes "changed"
		console.log("obj2.state = " + obj2.state); //"changed"
		console.log("obj3.state = " + obj3.state); //"changed"
	}

	change(num,name,obj1,obj2); //only changes in function scope 

	console.log("num = " + num); //10
	console.log("name = " + name); //Jane Austen
	console.log("obj1.state = " + obj1.state); //"unchanged"
	console.log("obj2.state = " + obj2.state); //"changed" because of obj2.state
	console.log("obj3.state = " + obj3.state); //"changed"