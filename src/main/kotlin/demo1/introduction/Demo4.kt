package demo1.introduction

//String template
fun main() {
    val name = "Kevin"
    val age = 21


    val message = "Name is ${name.lowercase()} and age is $age"

    println("Name is $name and age is $age")
    println("Name is ${name.uppercase()} and age is $age")
    println(message)

    println("////////////")
    val text = """
        Tell me and I forget.
        Teach me and I remember.
        Involve me and I learn.
        (Benjamin Franklin)
        """.trimIndent()
    println(text)


}