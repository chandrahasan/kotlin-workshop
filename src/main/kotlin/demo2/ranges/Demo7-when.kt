package demo2.ranges

enum class Colors {
    RED, GREEN, BLUE
}

fun main() {
    val color = Colors.RED

    when(color) {
        Colors.RED -> println("I'm red")
        Colors.GREEN -> println("I'm green")
        else -> println("I'm blue")
    }

    println("////////////")
    bool()

    println("////////////")
    ranges1()

    println("////////////")
    whenSelected()

}

fun bool() {
    val someBool = false

    when(someBool) {
        true -> println("it's true")
        false -> println("it's false")
    }

}

fun ranges1() {
    val num = 6
    val validNumbers = 10..50

    when(num) {
        !in validNumbers -> println("Num is valid") //!
        in 1..10 -> println("Num is in range")
        else -> println("Num is not in range")
    }

}

fun whenSelected() {
    val num = 8

    val isNumEqualSelectedValue = when (num) {
        6, 7 -> true
        else -> false
    }

    println("num is $num and isNumEqualSelectedValue is $isNumEqualSelectedValue")
}