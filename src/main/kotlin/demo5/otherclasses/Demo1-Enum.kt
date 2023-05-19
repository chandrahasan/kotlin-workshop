package demo5.otherclasses

enum class ErrorCodes1() {
    None,
    Unknown,
    ConnectionLost
}

enum class ErrorCodes(val error: Int) {
    None(10),
    Unknown(11),
    ConnectionLost(300)
}

fun main() {

    val errorCode = ErrorCodes.None

    when(errorCode) {
        ErrorCodes.None -> {
            println("No error")
        }
        ErrorCodes.Unknown -> { println("No error") }
        ErrorCodes.ConnectionLost -> {} //All constants must be included
    }

    println("errorCode has name ${errorCode.name} and it has ordinal ${errorCode.ordinal} and has value ${errorCode.error}")

    val error = ErrorCodes.valueOf("Unknown")
    println("error has name ${error.name} and it has ordinal ${error.ordinal} and has value ${error.error}")
    
}