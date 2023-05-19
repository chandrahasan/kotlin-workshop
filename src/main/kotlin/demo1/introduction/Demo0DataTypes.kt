package demo1.introduction

/*
Declare variables
- var and val
Syntax
var variableName:Type = value
val variableName = value

Inferred types
- Don’t have to specify type
- Compiler can infer type from declaration
*/

fun main(){
    val myByteNum: Byte = 100           // Byte -128 to 127
    val myShortNum: Short = 5000        // Short -32768 to 32767
    val myIntNum: Int = 5               // Int -2147483648 to 2147483647
    val myLongNum: Long = 15_000_000_000L  // Long -9223372036854775807 to 9223372036854775807
    val myFloatNum: Float = 5.75F       // Float - The precision is only 6 or 7 decimal digits
    val myDoubleNum: Double = 5.99      // Double - The precision is only 15 decimal digits
    val myLetter: Char = 'D'            // Char -  used to store a single character
    val myBoolean: Boolean = true       // Boolean - can only take the values true or false
    val myText: String = "Hello"        // String - used to store a sequence of characters (text)

//    myIntNum = 10

    println(myByteNum)
    println(myShortNum)
    println(myIntNum)
    println(myLongNum)
    println(myFloatNum)
    println(myDoubleNum)
    println(myLetter)
    println(myBoolean)
    println(myText)
}