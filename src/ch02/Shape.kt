package ch02

interface IShape {
	fun getArea(): Int
	fun getName() = ""
}

open class Shape /*constructor*/ (w: Int, h: Int) : IShape {
	var width: Int = w
	open val height: Int = h
		get() {
			println("Shape getHeight")
			return field	
		}
	
	init {
		println("Shape init width = $width, height = $height")
	}
	
	constructor(w: Int): this(w, 10) {
		println("Shape constructor(w)")
	}
	
	constructor(): this(20) {
		println("Shape constructor()")
	}
	
	override fun getArea(): Int {
		return width * height
	}
	
}

open class Rectangle(w: Int, h: Int) : Shape(w, h) {
	override var height: Int = h
		get() {
			println("Rectangle getHeight")
			return field	
		}
		set(height) {
			println("Rectangle setHeight")
			field = height
		}
	
    override fun toString(): String {
		return "rectangle width = $width, height = $height"
	}
	
}

class Square(l: Int): Rectangle(l, l) {

    final override fun toString(): String {
        return "Square width = $width, height = $height"
    }

}

fun main(args: Array<String>) {
    var r = Rectangle(10, 15)
    println(r.height)
    r.height = 20
    println(r.height)
	
	println(r)
}
