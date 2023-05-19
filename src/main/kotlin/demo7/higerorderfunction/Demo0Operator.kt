package demo7.higerorderfunction


class Person(var age: Int) {
    operator fun plus(y: Int) {
        age += y
    }
}

fun main() {

    val person = Person(35)
    person.plus(1)
    println(person.age)

    person + 1
    println(person.age)

}
