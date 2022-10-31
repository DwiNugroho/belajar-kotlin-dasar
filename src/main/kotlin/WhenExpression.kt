fun main() {
    val finalExam = 'E'

    when (finalExam) {
        'A' -> println("Amazing")
        'B' -> println("Good")
        'C' -> println("Not Bad")
        'D' -> println("Bad")
        'E' -> println("Try Again Next Year")
        else -> println("Ups")
    }

    when (finalExam) {
        'A', 'B', 'C' -> println("Lulus")
        else -> println("Tidak Lulus")
    }

    val criteria = arrayOf('A', 'B', 'C')

    when (finalExam) {
        in criteria -> println("Masuk Kriteria Kelulusan")
        !in criteria -> println("Tidak Masuk Kriteria Kelulusan")
    }
}