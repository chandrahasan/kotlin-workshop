package demo3classesInterface.demo2Inheritance


interface LoggerDemo2 {
    fun debug(message: String)
    fun info(message: String)
}

class StdoutLoggerDemo2 : LoggerDemo2 {
    override fun debug(message: String) {
        println(message)
    }

    override fun info(message: String) {
        println(message)
    }
}

class NullLoggerDemo2 : LoggerDemo2 {
    override fun debug(message: String) {

    }

    override fun info(message: String) {

    }
}