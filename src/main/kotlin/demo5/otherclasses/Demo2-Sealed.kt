package demo5.otherclasses

/*
Sealed Classes are:
- Used to create restricted class hierarchies
- All subclasses derive from‘sealed class’
- All direct subclasses in the same module
- Like enums but can create instances
- Instances have state
- Provides more control over inheritance
- Used in ‘when..is’ to differentiate

Similar to enums
- But can have instances of a sealed class
- With its own state
 */


sealed class PersonEvents(val id: Int) {
    class Awake(id: Int): PersonEvents(id)
    class Asleep(id: Int): PersonEvents(id)
    class Eating(id: Int, val food: String) : PersonEvents(id)
}

class Cooking(id: Int) : PersonEvents(id)

fun main() {
    var evt = PersonEvents.Awake(1)

    handlePersonEvent(evt)

    var evt1 = PersonEvents.Eating(23, "Nuts")
    handlePersonEvent(evt1)
}

fun handlePersonEvent(evt: PersonEvents) {
    when(evt) {
        is PersonEvents.Awake -> { println("Awake: ${evt.id}")}
        is PersonEvents.Asleep -> {}
        is PersonEvents.Eating -> {
            println("Eating: ${evt.id}, ${evt.food}")
        }
        is Cooking -> {}

    }
}


