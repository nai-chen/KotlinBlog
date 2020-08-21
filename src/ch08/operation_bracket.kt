package ch08

class StringList {
	var list = mutableListOf<String>("Hello World!", "Welcome")
	
	operator fun get(i: Int): String {
		return list[i]
	}
	
	operator fun set(i: Int, value: String) {
		list[i] = value
	}

	operator fun get(i: Int, j: Int): Char {
		return list[i][j]
	}
		
}

fun main(args: Array<String>) {
	var list = StringList()
	
	println(list[0])  // Hello World!
	println(list[1, 5])  // m
	
	list[0] = "Hi Mike"
	println(list[0])  // Hi Mike
}