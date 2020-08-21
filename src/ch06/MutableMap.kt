package ch06

class Person4 (var map : MutableMap<String, Any>) {
	
	var name : String by map
	var age : Int by map
	
}


fun main(args : Array<String>) {
	var map = mutableMapOf(
			"name" to "Mike",
			"age" to 25
	)
	
	var p = Person4(map)
	println(p.name)
	println(p.age)
	
	map.put("name", "Jack")
	println(p.name)
	
	p.age = 35
	println(map)
}