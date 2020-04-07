package ch06

open class Base {
	fun sub() {
		println("Base.sub")
	}
}

open class BaseHolder {
	
	open fun Base.add() {
		println("Base.add in BaseHolder")
	}
	
	fun test(b : Base) {
		b.add()
		b.sub()
	} 
}

open class SubHolder : BaseHolder() {
	
	override fun Base.add() {
		println("Base.add in SubHolder")
	}
	
}

fun main(args : Array<String>) {
//	BaseHolder().test(Base())
	SubHolder().test(Base())
}