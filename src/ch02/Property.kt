package ch02

class Property {
	private var value = 4
	var prop1: Int
		get() {
			println("get prop1")
			return value
		}
	    set(v) {
			println("set prop1")
			value = v
		}
	
	var prop2:Int = 20
		get() = field
		set(prop) {
			field = prop
		}
}