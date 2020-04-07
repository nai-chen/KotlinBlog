package ch06

interface Engine {
	fun run()
}

class EngineImpl : Engine {
	override fun run() {
		println ("Engine run")
	}
}

class Car(engine : Engine) : Engine by engine {
	
}

fun main(args : Array<String>) {
	Car(EngineImpl()).run()
}