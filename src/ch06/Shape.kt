package ch06

class Shape {
	companion object Factory {	 
	}	
}

fun Shape.Factory.create() : Shape {
	return Shape()
}

fun main(args : Array<String>) {
	var s = Shape.create()
}