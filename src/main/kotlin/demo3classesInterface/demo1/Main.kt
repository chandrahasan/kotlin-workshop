package demo3classesInterface.demo1

fun main() {
    println("Started...")

    val earth = Planet("Earth", 12742)

    //No getter setter needed to access the class properties
    println("Planet created: it's name is ${earth.name} and it's radius is ${earth.radius} and it's population is ${earth.population}")
//     println(earth.diameter)

    earth.population = 7_000_000_000
    println("Planet created: it's name is ${earth.name} and it's radius is ${earth.radius} and it's population is ${earth.population}")

//    earth.initPopulationRun()  //private
    val newPopulation = earth.runPopulationModel(0, 1000, 100)

    println("New population is $newPopulation")

}