package demo9.nullablity.demo3

/*
Null coalescing (?:)
- Also known as the ‘Elvis’ operator
- newMeeting = m?: Meeting()
- Returns value on null

Safe cast (as?)
- Safe cast (as?)
- val saveable = o as? ISaveable Casts to type or returns null

 */
fun main() {

    val m1 : Meeting3? = null
    m1?.close()

    val m2 = m1 ?: Meeting3()
    m2.close()

    val savable = m2 as? ISavable
    savable?.save()
}

interface ISavable {
    fun save()
}

class Meeting3{
    fun close() {
        println("Meeting closed")
    }
}
