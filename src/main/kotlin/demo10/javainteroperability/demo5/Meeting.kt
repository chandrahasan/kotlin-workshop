package demo10.javainteroperability.demo5


class Meeting {

    @JvmField
    val title = "Board"

    companion object {
        @JvmStatic
        fun build() : Meeting {
            println("building...")
            return Meeting()
        }
    }

}
