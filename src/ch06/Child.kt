package ch06

open class Super {
}

class Child : Super() {	
}

fun Super.add(value : Int) = value + 10

fun Child.add(value : Int) = value + 100

fun main(args : Array<String>) {
	var s1 : Super = Super()
	var s2 : Super = Child()
	var s3 : Child = Child()
	
	println(s1.add(5))  // 15
	println(s2.add(5))  // 15
	println(s3.add(5))  // 105
}