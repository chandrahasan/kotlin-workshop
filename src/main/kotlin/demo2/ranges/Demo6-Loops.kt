package demo2.ranges

fun main() {
    val people = HashMap<String, Int>()

    people["Sam"] = 31
    people["Alex"] = 31
    people["Harry"] = 33

    for((name1, age) in people) {
        println("$name1 is $age")
    }

    println("///////////////")
    overArray()

    println("///////////////")
    ranges()

}

fun overArray() {
    val nums = arrayOf(1, 5, 7, 8, 19, 34)

    for(num in nums) {
        println("Number: $num")
    }

    for((index, num) in nums.withIndex()){
        println("Number: $num at $index")
    }

}

fun ranges() {
    var numbers:IntRange = 1..10

    var char = 'a'..'z'
    // for(int i = 0; i < 10; i++) {}



    for (i in 1..10) {
        println("i is $i")
    }
    println("///////////////")

    for (i in 1..10 step 2) {
        println("(step) i is $i")
    }

    println("///////////////")

    for (i in 10 downTo 1) {
        println("(down) i is $i")
    }

    println("///////////////")

    for (i in 0 until 10) {
        println("(until) i is $i")
    }



}

