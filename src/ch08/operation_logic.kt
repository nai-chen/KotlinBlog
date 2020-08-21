package ch08

operator fun Complex.compareTo(other: Complex): Int {
	var diff = real - other.real
	return if (diff != 0) diff else imag - other.imag	
}

fun main(args: Array<String>) {
	var comp1 = Complex(5, 10)	
	var comp2 = Complex(8, -6)
	var comp3 = Complex(8, -6)
	
	println(comp1 > comp2)  // false
	println(comp2 <= comp3)  // true
	
	println(comp1 == comp2)  // false
	println(comp2 == comp3)  // true
}