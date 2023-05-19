package demo2.ranges

/*
Java Exceptions are Unchecked Checked
Kotlin Exceptions
- No checked exceptions
- Can still use try..catch..finally
 */

fun main() {
//    throwException()
    try {
        throwException()
    } catch (e: Throwable) {
        println(e.message)
    } finally {
        println("Inside finally")
    }
}

fun throwException()  { //throws Exception
    throw Exception("Some exception")
}