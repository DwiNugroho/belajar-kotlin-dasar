//  const variable
const val APP = "Belajar Kotlin"
const val VERSION = "1.0.0"

fun main() {
//    immutable variable
    val age = 22
    val fullName = "Dwi Nugroho"

//    mutable variable
    var firstName = "Dwi"
    firstName = "Ahmad"

    println(age)
    println(fullName)
    println(firstName)

//    nullable  variable (not recommended)
    var lastName: String? = null

    println(lastName)
    println(lastName?.length)

    lastName = "Nugroho"

    println(lastName)

    println(APP)
    println(VERSION)
}