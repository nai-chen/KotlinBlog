package ch04

class Data<T>(v: T) {
	var value = v
}

fun <T> copy(d: Data<T>): Data<T> {
	return Data(d.value)
}

fun <T> copy(from: Data<T>, to: Data<T>) {
	to.value = from.value
}

fun main(args: Array<String>) {
	// 创建类的实例时指定类型参数
	var strData: Data<String> = Data<String>("Hello World")
	// 编译器会进行类型推断
	var intData = Data(12)
	
	println(strData.value)  // Hello World
	println(intData.value)  // 12
}
