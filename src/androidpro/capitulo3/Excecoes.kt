package androidpro.capitulo3

fun main(args: Array<String>) {

    try {
        print("Digite um numero: ")
        val numero: Int = readLine()!!.toInt()
        val divisao: Int = 100 / numero
        println("A divisão é $divisao")
    } catch (e: Exception) {
        println("Erro: ${e.message}")
    } finally {
        println("Programa finalizado!")
    }

}