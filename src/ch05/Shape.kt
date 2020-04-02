package ch05

class Shape {
	
	companion object Factory {
		fun create() = Shape()
	}
	
}

fun main(args : Array<String>) {
	var s = Shape.create()
}