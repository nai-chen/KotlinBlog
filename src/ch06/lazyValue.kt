package ch06

val value : String by lazy {
	println ("lazy load")
	"Hello World"
}

fun main(args : Array<String>) {
	println(value)
	println(value)
} 