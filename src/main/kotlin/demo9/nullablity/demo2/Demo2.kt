package demo9.nullablity.demo1

//Not null assertions

fun main() {
    nullableParams()
}

private fun nullableParams() {

    var m1: Meeting1? =null
    var m2: Meeting1 = Meeting1()

    m2 = m1!!
    m2.close()
}

class Meeting1{
    fun close() {
        println("Meeting closed")
    }
}
