// Recursive Function

fun factorialRecursive(value: Int):Int {
    return when(value) {
        1 -> 1
        else -> value * factorialRecursive(value -1)
    }
}

// Tail Recursive Function

tailrec fun display(value:Int) {
    println("Recursive $value")
    if (value > 0) {
        display(value - 1)
    }
}

// Factorial with tail recursive function

tailrec fun factorialTailRecursive(value: Int, total: Int = 1):Int {
    return when(value) {
        1 -> total
        else -> factorialTailRecursive(value -1, total * value)
    }
}

fun main() {
    println(factorialRecursive(10))

    display(10000)

    println(factorialTailRecursive(10))
}