package demo6.companions

interface MouseListener {
    fun mouseClicked(e: MouseEvent)
    fun mouseEntered(e: MouseEvent)
}

class Window {
    fun addMouseListener(listener: MouseListener) {}
}


fun main() {
    val window = Window()

    window.addMouseListener(object: MouseListener {
        override fun mouseClicked(e: MouseEvent) {
            println("mouseClicked")
        }

        override fun mouseEntered(e: MouseEvent) {
            println("mouseEntered")
        }
    })
}

class MouseEvent {

}

