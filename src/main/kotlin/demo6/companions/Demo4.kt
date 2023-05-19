package demo6.companions

/*

Using ‘companion object’ to make an objects instance easier
- More like ‘static’ in other languages
- No need to qualify the name anymore

 */
class Invoice {

    companion object Logger {
        fun debug(message: String) {
            println("($this) ${message}")
        }
    }

    fun calculate() {
        debug("calculating invoice")
    }
}

fun main() {
    val invoice = Invoice()
    invoice.calculate()

    val invoice2 = Invoice()
    invoice2.calculate()

    Invoice.debug("Like a static")

    //Logger is not necessary
    Invoice.Logger.debug("called from demo7.higerorderfunction.main")
}