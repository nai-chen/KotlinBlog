package ch04

open class A{}
class B : A() {}

fun copy(from: Array<out A>, to: Array<A>) {
	
}

fun fill(dest: Array<in B>, v: B) {
}

interface Function<in T, out U> {
	
}

fun main(args: Array<String>) {
	var aArr: Array<A> = arrayOf(A(), A())
	var bArr: Array<B> = arrayOf(B(), B())
	
	copy(bArr, aArr)
	fill(aArr, B())
}