package demo8.collections

/*
- Collections in the standard library

Collections in the standard library
- Array
- List
- Map
- Set

Immutable collections
- List
- Map
- Set

Mutable versions
- MutableList
- MutableMap
- MutableSet

Have predicates
- any
- all
- count

Can map and filter
- filter
- map


 */
fun main() {
    var i = 0
    val numbers = Array<Int>(5) { i++ }
    for (num in numbers) {
        println(num)
    }

    println("/////////")
    var iArray = IntArray(2) { i++ }

    for (num in iArray) {
        println(num)
    }

    println("/////////")
    val people = Array<Person>(5) { Person("Kevin${i++}") }

    for (person in people) {
        println(person)
    }

    println("/////////")
    var morePeople = arrayOf(Person("Alice"), Person("Bob"), Person("Charlie"))

    for (person in morePeople) {
        println(person)
    }

    println("/////////")
    val bob = morePeople[1]

    println(bob)

    println("/////////")
    morePeople.forEachIndexed { index, person ->
        println("$index - $person")
    }
}

data class Person(val name: String)

