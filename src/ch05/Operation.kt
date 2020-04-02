package ch05

open class Operation(var base : Int) {
	
	open fun add(step : Int) {
		println(base + step)
	}
	
}

interface ISubtract {
	fun sub(v : Int)
}

fun main(args : Array<String>) {
	var op = Operation(10)
	op.add(1)  // 11
	
	op = object : Operation(10) {
		    override fun add(step : Int) {
			    println(base + step * 10)
		    }
	    }
	op.add(1)  // 20
	
	op = object : Operation(20), ISubtract {
		    override fun sub(v : Int) {
	    		println(base - v)
	    	}
	    }
	
	var obj = object {
		var x = 15
		var y = 20
	}
	println(obj.x + obj.y)  // 35
}