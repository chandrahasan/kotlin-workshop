package demo7.higerorderfunction


fun main() {
    printWork("Kevin", 23)
    printWork("Smith")
    printWork(age = 5, name = "Peter")
}

fun printWork(name: String, age: Int = 25) {
    println("Name: $name  Age: $age")
}