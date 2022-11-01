fun String.greeting(): String = "Hello $this"

fun main() {
    val name = "Dwi Nugroho"

    println(name.greeting())
}