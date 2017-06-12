package androidpro.capitulo1

fun main(args: Array<String>) {
    var array = arrayOf("SP", "RJ", "PR")

    array[0] = "RJ"
    array[1] = "SP"

    println(array[1])

    var mix = arrayOf("SP", 20, "RJ", 50)

    var inteiros = intArrayOf(30, 56, 21, 46, 70)

    for ((index, inteiro) in inteiros.withIndex()) {
        println("Index $index - Inteiro $inteiro")
    }

    var outrosEstados = arrayOf("PA", "BA", "SC")

    var todosEstados = array + outrosEstados

    for (estado in todosEstados) {
        println("Estado $estado")
    }

    var str = "Uma String"

    println(str[2])
}
