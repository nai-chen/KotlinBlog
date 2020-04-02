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
		println(v1.x)  // ���Է��ʣ�10
		// println(v2.x)  �������
		var op1 = foo()
		op1.add(1)  // ���Է��ʣ�11
		println(op1.x)  // ���Է��ʣ�10
		var op2 = publicFoo()
		op2.add(2)  // ���Է��ʣ�12
		// println(op2.x) �������
	}
	
}

fun main(args : Array<String>) {
	Anno().call()
}