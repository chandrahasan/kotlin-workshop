package demo2.ranges

fun main() {
    val nums = arrayOf(5)

//    val num = nums[1]
//    println("value is $num")

    try {
        val num = nums[1]
        println("value is $num")

    } catch (t: Throwable) {
        println(t.message)
    }

}