fun main() {
    fun hello(name: String, transformer: (String) -> String):String {
        val nameTransform =  transformer(name)

        return "Hello $nameTransform"
    }

    val upper = fun(value: String):String {
        return if (value == "") {
            "Ups"
        } else {
            value.uppercase()
        }
    }

    println(hello("Dwi", upper))
    println(hello("", upper))
    println(hello("Dwi", fun(value: String):String = value.lowercase()))
}