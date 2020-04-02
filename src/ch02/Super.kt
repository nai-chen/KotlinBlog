package ch02

abstract class Base {
	abstract fun f()
}

class Super : Base() {
	override fun f() {}
}