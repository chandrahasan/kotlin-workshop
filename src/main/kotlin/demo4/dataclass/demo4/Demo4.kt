package demo4.dataclass.demo4

// Destructuring

data class Person(val name: String, val age: Int)

fun main() {

    val sam = Person("Sam",31)
    val samuel = sam.copy(age = 32)

    println("$sam, has hashCode ${sam.hashCode()}")
    println("$samuel, has hashCode ${samuel.hashCode()}")


    println("Name: ${samuel.name},  Age: ${samuel.age}")

    val (name, a) = samuel
    println("Samuel has the $name and the age $a")

}
