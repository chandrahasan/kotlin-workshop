package demo8.collections


fun main() {
    lists()
    map()
}

fun lists() {
    val numbers = mutableListOf(1, 2, 3, 4)

    for (num in numbers) {
        println(num)
    }

    println("/////////")
    val n = numbers[0]
    println(n)

    println("/////////")
    numbers[0] = 5  //mutable
//
    println(numbers[0])
//
//    println("/////////")
    numbers.add(23)

    for (num in numbers) {
        println(num)
    }
}

fun map(){
    println("/////////")
    val people = mutableMapOf<Int, Person1>(11 to Person1("Kevin"), 2 to Person1("Teresa"), 3 to Person1("Harry"))

    for ((key, person) in people) {
        println("$key is $person")
    }
}

data class Person1(val name: String)
