package ch05

class Singleton private constructor() {
	
	private object mHolder {
		val INSTANCE = Singleton()
	}
	
	companion object Factory {
		fun getInstance() = mHolder.INSTANCE
	}
}

fun main(args : Array<String>) {
	var s1 = Singleton.getInstance()
	var s2 = Singleton.getInstance()
	println(s1 == s2)  // true
}