package androidpro.capitulo2

class Livro(val titulo: String, val autor: String, val ano: Int) {
    override fun toString(): String {
        return "Livro[titulo=$titulo]"
    }
}

data class DataLivro(val titulo: String, val autor: String, val ano: Int)



fun main(args: Array<String>) {
    val livro = Livro("AndroidPro Livro", "Fillipe Cordeiro", 2017)
    val livro2 = Livro("AndroidPro Livro", "Fillipe Cordeiro", 2017)

    val dataLivro = DataLivro("AndroidPro Livro", "Fillipe Cordeiro", 2017)
    val dataLivro2 = DataLivro("AndroidPro Livro", "Fillipe Cordeiro", 2017)

    println(livro)
    println(dataLivro)

    println("Livro Igual? " + livro.equals(livro2))
    println("Data Livro Igual? " + dataLivro.equals(dataLivro2))
}