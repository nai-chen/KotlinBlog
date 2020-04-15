package ch07

fun <T> max(list : List<T>, greaterThan: (T, T) -> Boolean): T? {
	var value: T? = null
	for (item in list) {
		if (value == null || greaterThan(item, value) ) {
			value = item
		}
	}
	return value
}

fun main(args: Array<String>) {
	var list = listOf(5, 9, 13, 51, 31, 69, 12, 48)
	
	var max = max(list, {x, y -> x > y})
	println(max) // 69
	
	var min = max(list) {
		x, y -> x < y
	}
	println(min)  // 5	
}