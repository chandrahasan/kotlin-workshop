package demo10.javainteroperability.demo3


fun main() {

    val firstLine:String = HomeAddress().firstLine
    println(firstLine)

    val firstLine1: String? = WorkAddress().firstLine
    println(firstLine1)
}

class HomeAddress : Address {
    override fun getFirstLine(): String {
        return "FirstLine"
    }
}

class WorkAddress : Address {
    override fun getFirstLine(): String? {
       return null
    }
}