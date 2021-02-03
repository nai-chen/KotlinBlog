package ch06

import kotlin.reflect.KProperty

class Teacher2 {
	var name: String by Delegate2 {
		"Teacher"
	}
}

class Student2 {
	var name: String by Delegate2 {
		"Student"
	}
}

class Delegate2<T>(initializer : () -> T) {
	var name: String = ""
	var className = initializer()
	
	operator fun getValue(thisRef : Any?, property : KProperty<*>) : String {
		println("${className}.getValue 被调用")
		return name
	}
	
	operator fun setValue(thisRef : Any?, property : KProperty<*>, value : String) {
		println("${className}.setValue 被调用")
		this.name = value;
	}
}

fun main(args: Array<String>) {
	var t: Teacher2 = Teacher2()
	t.name = "Mike"
	println(t.name)
	
	var s: Student2 = Student2()
	s.name = "Jack"
	println(s.name)
}