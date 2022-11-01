infix fun String.to(type: String):String {
    return if (type == "UP") {
        this.uppercase()
    } else {
        this.lowercase()
    }
}

fun main() {
    val result = "Dwi Nugroho" to "UP"

    println(result)
}