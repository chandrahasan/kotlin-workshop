package demo7.higerorderfunction

/*
What Are Higher Order Functions?
- Functions as first class citizens
- Can pass to and return from functions
- Can store in collections

Declaring Functions:
Functions have a type
- And can be declared
Type consists of parameters and return type
- Parameter types declared in brackets - Followed by ‘arrow’ ()->
- Followed by return type

(Int) -> Unit           - Function that takes an Int and returns Unit
(Int, String) -> Unit   - Function takes two parameters, Int and String
(String) -> Int         - Function that takes a String and returns an Int


Passing Functions
- Declare a function as having another function as a parameter
- Then call passing a function argument

Example:
fun foo(bar: Int, action: (Int) -> Unit) {}
fun someFunction(num: Int) {}

foo(23, { a -> someFunction(a) })
foo(23) { a -> someFunction(a) }
foo(23, { someFunction(it) })
foo(23) { someFunction(it) }
foo(23, ::someFunction)   //Function References

 */



fun main() {
    fibonacci(8)

    fibonacci(8, object : Process {
        override fun execute(value: Int) {
            println(value)
        }
    })
    fibonacci(8, {n -> println(n)})
    fibonacci(8, { println(it) })
    fibonacci(8) { println(it) }
    fibonacci(8, ::println)
}

fun fibonacci(limit: Int, action: (Int) -> Unit) {
    // 1, 1, 2, 3, 5, 8, 13, 21
    var prev = 0
    var prevprev = 0
    var current = 1

    for (i: Int in 1..limit) {
        action(current)

        var temp = current
        prevprev = prev
        prev = temp
        current = prev + prevprev
    }
}

interface Process {
    fun execute(value: Int)
}

fun fibonacci(limit: Int, process: Process) {
    // 1, 1, 2, 3, 5, 8, 13, 21
    var prev = 0
    var prevprev = 0
    var current = 1

    for (i: Int in 1..limit) {
        process.execute(current)

        var temp = current
        prevprev = prev
        prev = temp
        current = prev + prevprev
    }
}

fun fibonacci(limit: Int) {
    // 1, 1, 2, 3, 5, 8, 13, 21
    var prev = 0
    var prevprev = 0
    var current = 1

    for (i: Int in 1..limit) {
        println(current)

        var temp = current
        prevprev = prev
        prev = temp
        current = prev + prevprev
    }
}