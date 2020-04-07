package ch06

import kotlin.properties.Delegates

class Person {
	// MikeÊÇ³õÊ¼Öµ
	var name : String by Delegates.observable("Mike") {
		prop, oldValue, newValue ->
			println("oldValue = $oldValue, newValue = $newValue")
	} 
}

fun main(args : Array<String>) {
	var p = Person()
	p.name = "Jack"
	p.name = "Peter"
}