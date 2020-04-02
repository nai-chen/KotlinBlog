package ch04

fun <T : Comparable<T>> equals(v1: T, v2: T): Boolean {
	return v1.compareTo(v2) == 0
}

fun main(args: Array<String>) {
	println(equals(1, 1))  // true
	println(equals(1, 2))  // false
}

interface ICopy<T> {
	fun copy(): T
}

fun <T> copy(t: T) : T
	 where T : Comparable<T>, T : ICopy<T> {
	return t.copy()
}