package demo7.higerorderfunction

class Math {
    infix fun square(n: Int): Int {
        return n * n
    }
}

fun main() {
    val m = Math()
    m.square(3)

    // call using infix notation
    val result1 = m square 3
    print("The square of a number is: $result1")
}