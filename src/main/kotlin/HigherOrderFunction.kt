fun main() {
    fun hello(name: String, transformer: (String) -> String):String {
        val nameTransform =  transformer(name)

        return "Hello $nameTransform"
    }

    val lambdaUpper = {value: String -> value.uppercase()}

    println(hello("Dwi Nugroho", lambdaUpper))
    println(hello("Dwi Nugroho", { value: String -> value.lowercase() }))

    val result = hello("Dwi Nugroho") {value: String -> value.lowercase()}

    println(result)
}