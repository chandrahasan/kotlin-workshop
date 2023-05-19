package demo9.nullablity.demo2
/*
- Nullability is the ‘billion dollar problem’
- Java often throws NullPointerException
- Need lots of defensive code
- Kotlin supports 'nullable' types
        - Put '?' after type name
        - val m: Meeting?
- Means only explicit variables can be null
- Collections also support null constraints
 */

/*
Safe Call (?.)
m?.method()
Checks for null
Calls function only if non-null reference
 */

fun main() {

    nullableVar()
    nullableParams()
}


private fun nullableVar() {
    var name: String? = "Kevin"
    println(name)
    name = null
    println(name)
}


private fun nullableParams() {
    val o = Organizer()
    o.closeMeeting(null)

    o.closeMeeting(Meeting())


}

class Organizer {
    fun closeMeeting(m: Meeting?) {
        m?.close()
    }
}

class Meeting{
    fun close() {
        println("Meeting closed")
    }
}
