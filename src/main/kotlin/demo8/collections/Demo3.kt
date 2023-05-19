package demo8.collections

fun main() {
    predicates()
    println("///////")

    val numbers = listOf(10, 23, 3, 42, 51, 123, 6, 8, 99)

    val over50 = numbers.filter { it > 50 }

    for (item in over50) {
        println(item)
    }

    println("///////")

    val multipliedValues = over50.map { it * 3 }

    for (item in multipliedValues) {
        println(item)
    }

    println("///////")
    val newNumbers = numbers.filter { it > 50 }.map { (it * 3).toString() }

    for (item in newNumbers) {
        println(item)
    }
}


fun predicates() {
    val numbers = listOf(10, 23, 3, 42, 51, 123, 6, 8, 99)

    val size = numbers.count()

    println("Size is: $size")

    val is100 = numbers.any { it > 99 }

    println("Number 100 or more: $is100")

    val allGreaterThanFifty = numbers.all { it > 50 }

    println("All > 50 : $allGreaterThanFifty")
}

