package ch03

data class Student(val name: String, var age: Int)

fun main(args: Array<String>) {
	var stud1 = Student("Mike", 18)
	var stud2 = Student("Mike", 18)
	var stud3 = Student("Jack", 19)
	
	println(stud1)  // Student(name=Mike, age=18)
	println(stud1.equals(stud2))  // true
	println(stud1.equals(stud3))  // false
	
	var stud4 = stud1.copy()
	println(stud4)  // Student(name=Mike, age=18)
	println(stud1.copy(age=20))  // Student(name=Mike, age=20)
	
	var (name, age) = stud1
	println("name = $name, age = $age")  // name = Mike, age = 18
}