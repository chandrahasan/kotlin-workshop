package demo8.collections

/*
- Similar as Java streams
- Sequences are lazily evaluated
- Evaluation starts when using terminal operation
 */

fun main() {
    val numbers = listOf(10, 23, 3, 42, 51, 123, 6, 8, 99)


    val newNumbers = numbers
        .asSequence()
        .filter {
            println("filter: $it")
            it > 9
        }
        .map {
            println("map: $it")
            it * 3
        }
        .take(3)
        .joinToString(",")

    println(newNumbers)
}



