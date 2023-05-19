package demo4.dataclass.demo1

/*
What Is a Data Class?
Many times in code we need to model data
- But no behaviour
We need ‘data transfer objects’ (DTOs)
- Moving data to and from a database
- Sending data over HTTP
- Storing data in collections

Data Class Provide implementations of
- toString
- hashCode
- equals

Overriding functionality
- Provide our own implementations of hashCode, equals or toString

 */

data class Person(val name: String, val age: Int)

fun main() {

    val sam = Person("Sam", 31)
    val samuel = Person("Sam", 31)

    println("$sam, has hashCode ${sam.hashCode()}")
    println("$samuel, has hashCode ${samuel.hashCode()}")

    if (sam.equals(samuel)) {
        println("these are the same")
    }

    if (sam == samuel) {
        println("these are the same")
    }

    if (sam === samuel) {
        println("these are the same")
    } else {
        println("these are not the same")
    }

}