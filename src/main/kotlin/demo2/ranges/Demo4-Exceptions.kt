package demo2.ranges

//try block as an expression

fun main() {
    val nums = arrayOf(1)
    

    val ans = try {
        nums[1]
    } catch (t: Throwable) {
        println("Hello")
        0
    }
    println("The answer is $ans")
}

