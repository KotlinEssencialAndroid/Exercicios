package androidpro.capitulo2

interface Dirigivel {
    fun acelerar(velocidade: Long)
}

interface Carregavel {
    fun carregar(quantidade: Int)
}

open class Veiculo(open var cor: String, open var ano: Int, open var modelo: String)

class Carro(override var cor: String, override var ano: Int, override var modelo: String):
        Veiculo(cor, ano, modelo), Dirigivel {

    override fun acelerar(velocidade: Long) {
        println("Acelerando o $modelo a $velocidade Km/h")
    }

    fun abrirPorta() {
        println("Abrindo a porta do $modelo")
    }

}

class Caminhao(override var cor: String, override var ano: Int, override var modelo: String, var capacidade: Long):
        Veiculo(cor, ano, modelo), Dirigivel, Carregavel {

    override fun acelerar(velocidade: Long) {
        println("Acelerando o $modelo a $velocidade km/h")
    }

    override fun carregar(quantidade: Int) {
        println("Carregando o caminhão com $quantidade toneladas")
    }
}

fun main(args: Array<String>) {
    val uno: Dirigivel = Carro("Amarelo", 2018, "Uno")

//    println("Carro: Cor ${uno.cor}, Ano ${uno.ano}, Modelo ${uno.modelo}")
//
//    uno.abrirPorta()

    uno.acelerar(100)

    val scania:Carregavel = Caminhao("Branco", 2015, "X 78", 1000)

//    println("Caminhao: Cor ${scania.cor}, Ano ${scania.ano}, Modelo ${scania.modelo}, Capacidade ${scania.capacidade}")

//    scania.acelerar(50)

    scania.carregar(3)
}

