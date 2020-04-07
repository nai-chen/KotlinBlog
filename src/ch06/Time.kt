package ch06

import java.text.SimpleDateFormat
import java.util.Date

fun Long.format(): String {
	return SimpleDateFormat("yyyy-MM-dd hh:mm:ss")
			.format(Date(this * 1000))
}

fun main(args : Array<String>) {
	var time : Long = 1585891747
	println(time.format());  // 2020-04-03 01:29:07
}