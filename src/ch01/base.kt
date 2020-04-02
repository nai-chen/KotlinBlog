package ch01

fun main(args: Array<String>) {
	var a1: Int
	var a2: Long = 2
	val a3 = 10
	
	var c1: Char
	var c2 = 'a'
	
	if (c2.toInt() == 97) {
		println(c2) // a
	}
	
	var arr = arrayOf(1, 2, 3, 'a')
	println(arr[2]) // 3
	arr[2] = 'b'
	println(arr[2]) // b
	
	arrayOfNulls<Int>(4)
	
	Array<Int>(4, { i -> i * i })
	
	doubleArrayOf(1.0, 2.0, 3.0)
	
	var s1: String
	var s2 = "Hello World!"
	var s3 = """
    	This is format String
        	with space.
    """
	
	var s4 = "abcd"		
	println("$s4.length is ${s4.length}") // abcd.length is 4
}

fun add(a: Int, b: Int): Int {
	return a + b
}

fun add(): Unit {
	
}