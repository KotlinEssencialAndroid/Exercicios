package androidpro.capitulo3

fun main(args: Array<String>) {
    var map = hashMapOf("Chave1" to 1, "Chave2" to 2, "Chave3" to 3)
    map.put("Chave4", 4)

    map.remove("Chave3")

    for(chave in map.keys) {
        println("$chave:${map.get(chave)}")
    }
}