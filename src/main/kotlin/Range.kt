fun main() {
//    val range = 0..1000
    val range = 100 downTo 1 step 5
    println(range.count())
    println(range.contains(50))
    println(range.first)
    println(range.last)
    println(range.step)
    println(range)
}