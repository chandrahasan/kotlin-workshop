package demo7.higerorderfunction

fun String.removeFirstLastChar(): String =  this.substring(1, this.length - 1)

fun main() {
    val myString= "Hello Everyone"
    val result = myString.removeFirstLastChar()
    println("First character is: $result")
}