package demo1.introduction

fun main() {
    val count = 6

    when(count) {
        1 -> println("Count is 1")
        6 -> println("Count is 6")
        else -> {
            println("Count is unexpected")
        }
    }
}

fun usingIf() {
    val count = 6

    if (count < 5) {
        println("Count is less than 5")
    } else if (count < 10){
        println("Count is less than 10")
    } else {
        println("Count is more than 10")
    }
}