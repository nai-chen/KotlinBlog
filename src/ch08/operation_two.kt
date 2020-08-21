package ch08

operator fun Complex.plus(other: Complex) = Complex(real + other.real, imag + other.imag)

operator fun Complex.minus(other: Complex) = Complex(real - other.real, imag - other.imag)

fun main(args: Array<String>) {
	var comp1 = Complex(8, -10)
	var comp2 = Complex(5, 5)
	
	println(comp1 + comp2)  // 13 -5i
	println(comp1 - comp2)  // 3 -15i
}