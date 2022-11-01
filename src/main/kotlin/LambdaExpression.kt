fun toUpper(value: String)  = value.uppercase()

fun main() {
    val lambdaFunction: (String, String) -> String = {firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }


    val result = lambdaFunction("Dwi", "Nugroho")

    println(result)


    val toUppercase: (String) -> String = {
        it.uppercase()
    }

    println(toUppercase("Dwi Nugroho"))

    val toUppercase2: (String) -> String = ::toUpper

    println(toUppercase2("Dwi Nugroho"))
}