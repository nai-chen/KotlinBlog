package ch06

class Operation {
	var i:Int = 0
	
	fun add(value : Int) : Int {
		return value + 10
	}
}

fun Operation.add(value : Int) : Int {
	return value + 100
}

var Operation.value : Int
		get() = i
		set(v : Int) {
			i = v
		}


fun main(args : Array<String>) {
	var op = Operation()
	println(op.add(5))  // 15
	
	op.value = 10
	println(op.value)  // 10
}