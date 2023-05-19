package demo3classesInterface.demo1

/*
Classes:
- Defined with the ‘class’ keyword
- public by default
- final by default
- Have a primary constructor
- May have secondary constructors
- No ‘new’ keyword
- Maybe abstract
- May have properties and methods

Class members:
--------------
- private means that the member is visible inside this class only (including all its members).

- protected means that the member has the same visibility as one marked as private,
but that it is also visible in subclasses.

- internal means that any client inside this module who sees the declaring class sees its internal members.

- public means that any client who sees the declaring class sees its public members.
 */

//class Planet1

class Planet(val name: String, diameter: Int) {
    var population: Long

    init {
        println("We've been created with name: $name")
        population = 0
    }

    val radius: Int = diameter/2


    //use default value instead of secondary constructors
    constructor(name: String, diameter: Int, gaseous: Boolean) : this(name, diameter)
    constructor(name: String, diameter: Int, gaseous: Boolean, hasLife: Boolean) : this(name, diameter)

    private fun initPopulationRun(startDate: Int, endDate: Int, startPopulation: Int) {
        // do some work
    }

    fun runPopulationModel(startDate: Int, endDate: Int, startPopulation: Int) : Long {
        initPopulationRun(startDate, endDate, startPopulation)
        return population
    }
}