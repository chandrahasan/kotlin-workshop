package demo3classesInterface.demo2Inheritance

//abstract classes open by default
abstract class SpaceBody(val name: String) {
    abstract fun calculateMotion()
}

class BlackHole(name: String) : SpaceBody(name) {
    override fun calculateMotion() {
        TODO("Not yet implemented")
    }
}

//open class
open class PlanetDemo2(name: String, diameter: Int, val logger: LoggerDemo2) : SpaceBody(name) {
    open var population: Long = 0

    init {
        println("We've been created with name: $name")
        population = 0
    }

    val radius: Int = diameter / 2

    override fun calculateMotion() {
       println("SpaceBody abstract class called")
    }

    constructor(name: String, diameter: Int, gaseous: Boolean, logger: LoggerDemo2) : this(name, diameter, logger)
    constructor(name: String, diameter: Int, gaseous: Boolean, hasLife: Boolean, logger: LoggerDemo2) : this(name, diameter, logger)

    private fun initPopulationRun(startDate: Int, endDate: Int, startPopulation: Int) {
        // do some work
    }

      open fun runPopulationModel(startDate: Int, endDate: Int, startPopulation: Int): Long {
        logger.debug("Logger interface called")
        initPopulationRun(startDate, endDate, startPopulation)
        return population
    }
}

class HabitablePlanetDemo2(name: String, diameter: Int, logger: LoggerDemo2) : PlanetDemo2(name, diameter, logger) {
    override var population: Long = 0

    override fun runPopulationModel(startDate: Int, endDate: Int, startPopulation: Int): Long {
        super.runPopulationModel(startDate, endDate, startPopulation)
        return 0
    }
}