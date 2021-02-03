package ch04

class OutData<out T>(val v: T) {
	
	fun getValue(): T {
		return v
	}
}

fun main(args: Array<String>) {
	var strData = OutData<String>("Hello World")
	var objData: OutData<Any> = OutData("Object")
	
	objData = strData  // OutData<String>可以看做OutData<Any>的子类
}