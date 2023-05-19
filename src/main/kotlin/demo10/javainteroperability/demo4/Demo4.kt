package demo10.javainteroperability.demo4

fun main() {
     val m = Meeting("Board Meeting")

     m.backgroundSave { println("Meeting $it saved") }
     m.backgroundSave(::println)
}

