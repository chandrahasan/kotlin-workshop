package demo6.companions

//Singleton object
object Logger {
    fun debug(message: String) {
        println("** debug: $this $message")
    }

    fun info(message: String) {
        println("** info: $message")
    }

}

class Person {
    fun doWork() {
//      val logger = Logger()
        Logger.debug("some message")
    }
}

fun main() {
    val kevin = Person()
    kevin.doWork()

    val terry = Person()
    terry.doWork()
}