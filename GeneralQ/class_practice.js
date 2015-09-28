var Person = function (firstName){
	this.firstName = firstName;
	console.log("Person instantiated");
}

var person1 = new Person("Alice");
var person2 = new Person("Bob");

Person.prototype.sayHello = function() {
	console.log("Hello, I'm " + this.firstName);
}

person1.sayHello();
person2.sayHello();


