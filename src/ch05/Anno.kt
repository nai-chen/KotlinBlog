package ch05

class Anno {
	private var v1 = object {
		var x = 10
	}
	var v2 = object {
		var x = 10
	}
	
	private fun foo() = object : Operation(10) {
		var x = 10
	}
	
	fun publicFoo() = object : Operation (10) {
		var x = 10
	}
	
	fun call() {
		println(v1.x)  // 可以访问，10
		// println(v2.x)  编译错误
		var op1 = foo()
		op1.add(1)  // 可以访问，11
		println(op1.x)  // 可以访问，10
		var op2 = publicFoo()
		op2.add(2)  // 可以访问，12
		// println(op2.x) 编译错误
	}
	
}

fun main(args : Array<String>) {
	Anno().call()
}