package androidpro.capitulo3

fun main(args: Array<String>) {
    var arrayList = arrayListOf("Joao", "Maria", "Fillipe")
    arrayList.add("Jaqueline")

    println(arrayList)

    arrayList.remove("Joao")

    println(arrayList)

    println(arrayList.size)
    println(arrayList.isEmpty())
    println(arrayList.contains("Fillipe"))

    for (nome in arrayList) {
        println(nome)
    }
}