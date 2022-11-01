fun main() {
    val array = arrayOf("Ahmad", "Dwi", "Nugroho")

    var total = 0
    for (name in array) {
        println(name)
        total++
    }

    println("Total data adalah $total")

    val arraySize = array.size - 1

    for (i in 0..arraySize) {
        println("Index $i = ${array[i]}")
    }
}