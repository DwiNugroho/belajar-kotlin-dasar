// function with nullable parameter
fun sayHello(firstName: String, lastName: String?) {
    if (lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}

// function with default value parameter
fun printName(firstName: String, lastName:String = "") {
    println("$firstName $lastName")
}

// function with return

fun generateFullName(firstName: String, lastName: String): String {
    return "$firstName $lastName"
}

// Single Expression Function

fun jumlah(a: Int, b:Int):Int = a + b


fun main() {
    sayHello("Dwi", null)
    sayHello("Tim", "Henson")

    printName("Dwi")
    printName("Tim", "Henson")

//    call function with named argument
    printName(lastName = "Nugroho", firstName = "Dwi")

    println(generateFullName("Dwi", "Nugroho"))

    val total = jumlah(5, 6)

    println(total)
}