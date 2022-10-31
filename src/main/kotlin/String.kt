fun main() {
    val firstName = "Dwi"
    val lastName = "Nugroho"

    val fullName = "$firstName $lastName"

    val desc = "$fullName length = ${fullName.length}"

    val address = """
        |Tuban,
        |Jawa Timur,
        |Indonesia
    """.trimMargin()

    println(fullName)
    println(desc)
    println(address)
}