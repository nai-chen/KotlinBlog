package ch03

//enum class Direction {
//    EAST, SOUTH, WEST, NORTH
//}

enum class Direction private constructor(v: Int){
    EAST(10), SOUTH(20), WEST(30), NORTH(40);

    var value = v

    override fun toString(): String {
        return "$value"
    }

}

fun main(args: Array<String>) {
    var d1: Direction
    var d2 = Direction.EAST
    d1 = Direction.WEST

	println(d1)  // WEST
    println(d1.name)  // WEST
    println(d1.ordinal)  // 2

    var d3 = Direction.valueOf("SOUTH")
    println(d3)  // SOUTH
	
	for (d in Direction.values()) {
		println(d)
	}
}