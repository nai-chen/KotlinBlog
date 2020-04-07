package ch06

import kotlin.reflect.KProperty

class Teacher {
	// ��name����ί�и�Delegate��
	var name: String by Delegate()
}

class Student {
	// ��name����ί�и�Delegate��
	var name: String by Delegate()
}

class Delegate() {
	var name: String = ""
	
	operator fun getValue(thisRef : Any?, property : KProperty<*>) : String {
		println("Delegate.getValue ������")
		return name
	}
	
	operator fun setValue(thisRef : Any?, property : KProperty<*>, value : String) {
		println("Delegate.setValue ������")
		this.name = value;
	}
}

fun main(args: Array<String>) {
	var t: Teacher = Teacher()
	t.name = "Mike"
	println(t.name)
	
	var s: Student = Student()
	s.name = "Jack"
	println(s.name)
}