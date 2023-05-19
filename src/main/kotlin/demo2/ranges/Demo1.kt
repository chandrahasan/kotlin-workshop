package demo2.ranges

fun main() {
    val a = 23
    val b = 10


/*
    if(a < b){
        min = a
        }
    else
        min = b
*/

    //No ternary operator in Kotlin
    //min = a < b ? a:b

    val min1 = if (a < b) a else b

    val min = if (a < b) {
        println("about to return a")
        a
    }
    else {
        println("about to return b")
        b
    }

    println("min is $min")
}