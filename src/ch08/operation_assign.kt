package ch08

operator fun Complex.timesAssign(n: Int) {
	real *= n
	imag *= n;
}

fun main(args: Array<String>) {
	var comp = Complex(5, -10)	
	comp *= 5
	println(comp)  // 25 -50i
}