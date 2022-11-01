fun hitungTotal(name: String, vararg values: Int): String {
    var total = 0;

    for (value in values) {
        total += value
    }

    return "total $name = $total"
}

fun main() {
    val total = hitungTotal("Botol", 34,234,234,234,23,423,4,23,423,4,23,4,234)

    println(total)
}