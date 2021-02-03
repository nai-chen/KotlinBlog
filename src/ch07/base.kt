package ch07

// 没有参数
var f1 = { -> println("in f1")}

// 一个参数
var f2 = { x: Int -> println("in f2 x = $x")}

// 多个参数，最后一个表达式可以作为返回值
var f3 = { x: Int, y: Int -> x + y}

// 指定函数类型
var f4: (Int, Int, Int) -> Int = { x, y, z -> x + y + z}

// 只有一个参数时，可以省略声明，使用参数名it
var f5: (Int) -> Int = { it + 4 }

fun main(args: Array<String>) {
	f1()  // in f1
	f2(3)  // in f2 x = 3
	println(f3(3, 4))  // 7
	println(f4(3, 4, 5))  // 12
	println(f5(6))  // 10
}