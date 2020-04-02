package ch03

sealed class Shape {
}

class Rectangle : Shape() {
}

class Circle : Shape() {
}

fun getType(shape: Shape) = when(shape) {
		is Rectangle -> "Rectangle"
		is Circle -> "Circle"
	}

fun main(args: Array<String>) {
	var s: Shape = Rectangle()
	println(getType(s))
	
	s = Circle()
	println(getType(s))
}


