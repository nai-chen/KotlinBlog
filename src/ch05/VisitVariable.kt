package ch05

fun main(args : Array<String>) {
	var v = 10
	
	var obj = object {
		fun foo() {
			v = 100
		}
	}
	
	println(v)  // 10
	obj.foo()
	println(v)  // 100
}