package ch02

class Function {
	
	fun show(i: Int = 5, d: Double = 10.0, flag: Boolean = false) {
		println("i = $i, d = $d, flag = $flag")
	}
	
}

fun addFunction(vararg functions: Function): List<Function> {
	var list = ArrayList<Function>()
	for (f in functions) {
		list.add(f)
	}
	return list
}

fun main(args: Array<String>) {
    var f = Function()
    f.show(1, 2.0, true)  // i = 1, d = 2.0, flag = true
    f.show(15, 25.0)  // i = 15, d = 25.0, flag = false
    f.show(6, flag = true)  // i = 6, d = 10.0, flag = true
}