package ch01

fun main(args: Array<String>) {
	var a = 12
	var b = 15
//	var min: Int
//	if (a < b) {
//	    min = a
//	} else {
//	    min = b
//	}

	var min = if (a < b) {
	    a
	} else {
	    b
	}

	when (a) {
		1 -> println("a == 1")
		2, 3 -> println("a == 2 or 3")
		in (4..10) -> println("a in (4..10)")
		else -> {
			println("not found")
		}
	}

	var m: Char = when (a) {
		1 -> 'a'
		2, 3 -> 'b'
		in (4..10) -> 'c'
		else -> {
			'd'
		}
	}
	
	when (a) {
		getValue(1) -> println("getValue(1)")
		getValue(2) -> println("getValue(2)")
		else -> {
			println("not found")
		}
	}

	var arr = intArrayOf(1, 1, 2, 3, 5, 8)
	for (item: Int in arr) {
	    println(item)
	}
	
	for (index in arr.indices) {
	    println("arr[$index] = ${arr[index]}")
	}
	
	for ((index, value) in arr.withIndex()) {
	    println("arr[$index] = $value")
	}

	var i: Int = 1
	while (i < 10) {
		if (i == 6) break
		println(i++)
	}

	do {
		if (i == 5) continue
		println(i)
	} while (--i > 0)

}

fun getValue(v: Int): Int {
    return v + 10
}
