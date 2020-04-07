package ch06

class Person3 (var map : Map<String, Any>) {
	
	val name : String by map
	val age : Int by map
	
}

fun main(args : Array<String>) {
	var map = mapOf(
			"name" to "Mike",
			"age" to 25
	)
	
	var p = Person3(map)
	println(p.name)
	println(p.age)
}