package androidpro.capitulo1

import java.util.*

fun main(args: Array<String>) {
    olaMundo()
    println(queHorasSao())

    var total = soma(10, 12)

    println("Total $total")
}

fun soma(a: Int, b: Int): Int {
    return a + b
}

fun queHorasSao(): Date {
    return Date()
}

fun olaMundo() {
    println("Ola Mundo!")
}