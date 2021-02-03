package ch04

class InData<in T>() {
	
	fun setValue(t: T) {
		
	}
}

fun main(args: Array<String>) {
	var intData = InData<Int>()
	var anyData = InData<Any>()
	
	intData = anyData  // InData<Any>可以看做InData<Int>的子类
}