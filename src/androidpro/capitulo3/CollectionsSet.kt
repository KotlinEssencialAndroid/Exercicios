package androidpro.capitulo3

fun main(args: Array<String>) {
    var set = hashSetOf(1, 2, 4, 4, 60, 60, 70)
    set.add(100)

    set.remove(60)

    for (item in set) {
        println(item)
    }
}
