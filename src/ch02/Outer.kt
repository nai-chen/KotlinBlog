package ch02

class Outer {
	var value = 10
	
	class Nested {
		fun show() {
			println("Outer.Nested")
		}
	}
	
	inner class Inner {
		fun show() {
			println("Outer.Inner")
		}
	}
	
}

fun main(args: Array<String>) {
    Outer.Nested().show()  // Outer.Nested
    Outer().Inner().show()  // Outer.Inner
}