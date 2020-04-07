package ch06

import kotlin.properties.Delegates

class Person2 {

	var name : String by Delegates.vetoable("Mike") {
		prop, oldValue, newValue ->
			println("oldValue = $oldValue, newValue = $newValue")
		
			var result = true
			if (newValue.equals("Peter")) {				
				result = false
			}
			result
	} 
}

fun main(args : Array<String>) {
	var p = Person2()
	p.name = "Jack"
	p.name = "Peter"
	println(p.name)
}