package ch08

operator fun Complex.unaryPlus() = Complex(+real, +imag)
	
operator fun Complex.unaryMinus() = Complex(-real, -imag)

operator fun Complex.not() = real == 0 && imag == 0

operator fun Complex.inc() = Complex(real + 1, imag + 1)

operator fun Complex.dec() = Complex(real - 1, imag - 1)

fun main(args: Array<String>) {
	var comp1 = Complex(5, -10)	
	var comp2 = Complex(0, 0)
	
	println(+comp1)  // 5 -10i
	println(-comp1)  // -5 +10i
	
	println(!comp1)  // false
	println(!comp2)  // true
	
	println(comp1++)  // 5 -10i
	println(++comp1)  // 7 -8i
}