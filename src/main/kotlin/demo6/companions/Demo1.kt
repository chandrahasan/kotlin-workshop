package demo6.companions

/*

Using ‘object’ to create anonymous instances
- Very useful for things like listeners
Using ‘object’ to create singletons
- Singleton pattern can be useful -Ex: Loggers,resource managers
 */

fun main() {
    val simple = object {
        val name = "Kevin"

        fun printValue() {
            println(name)
        }
    }

    println(simple.name)
    simple.printValue()
}

