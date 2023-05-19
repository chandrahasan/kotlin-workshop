package demo9.nullablity.demo4

/*
‘let’ function
- Used to avoid explicit null checks
- Useful when passing Nullable values to functions expecting non-null values

Late initialized properties
- Sometimes values cannot be initialized when declared
- Do not want to mark them as Nullable
- Use 'lateinit' instead

 */

fun main() {

    var m2 = Meeting4()
    closeMeeting(m2)


    var m1: Meeting4? = null

    m1?.close()

    m1?.let {
        closeMeeting(it)
    }
}

fun closeMeeting(m: Meeting4) {
    m.close()
}

class Address

class Meeting4 {
    lateinit var address: Address

    fun close() {
        println("Meeting closed")

    }

    fun initAddress(addr : Address) {
        address = addr
    }
}


















