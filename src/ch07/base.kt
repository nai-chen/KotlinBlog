package ch07

// û�в���
var f1 = { -> println("in f1")}

// һ������
var f2 = { x: Int -> println("in f2 x = $x")}

// ������������һ�����ʽ������Ϊ����ֵ
var f3 = { x: Int, y: Int -> x + y}

// ָ����������
var f4: (Int, Int, Int) -> Int = { x, y, z -> x + y + z}

// ֻ��һ������ʱ������ʡ��������ʹ�ò�����it
var f5: (Int) -> Int = { it + 4 }

fun main(args: Array<String>) {
	f1()  // in f1
	f2(3)  // in f2 x = 3
	println(f3(3, 4))  // 7
	println(f4(3, 4, 5))  // 12
	println(f5(6))  // 10
}