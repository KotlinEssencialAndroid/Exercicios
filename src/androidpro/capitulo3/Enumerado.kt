package androidpro.capitulo3

enum class Direcao {
    NORTE, SUL, LESTE, OESTE
}

class Bussola {
    var direcao: Direcao = Direcao.LESTE
}

fun main(args: Array<String>) {
    val bussola = Bussola()

    println(bussola.direcao)

    bussola.direcao = Direcao.NORTE

    println(bussola.direcao)
}