package demo5.otherclasses


class OuterNested {
//    val name: String = "Kevin";
    class Nested {
        val name: String = "Kevin from Nested";
        fun doSomething(){
            println(name)
        }
    }
}

class Outer {
    val name: String = "Kevin from Inner";
    inner class Inner {
        fun doSomething(){
            println(name)
        }
    }
}

fun main() {
    val nested = OuterNested.Nested()
    nested.doSomething()

    val innerClass = Outer().Inner()
    innerClass.doSomething()
}

/*

Nested and inner classes
- Similar but
- Nested classes are scoped
- Inner classes created with instanceof outer
- Inner classes have access to outer’s data and methods
 */