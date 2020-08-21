package ch08

class Complex(r: Int, i: Int) {
	var real = r
	var imag = i
	
	override fun toString(): String {
		if (imag >= 0) {
			return "$real +${imag}i"
		} else {
			return "$real ${imag}i"
		}
	}
	
	operator override fun equals(other: Any?): Boolean {
		if (other is Complex) {
			return real == other.real && imag == other.imag
		}
		return false
	}

	
}