fun main() {
    var totalDesks = calculateNumberOfDesks(readLine()!!.toInt())
    totalDesks += calculateNumberOfDesks(readLine()!!.toInt())
    totalDesks += calculateNumberOfDesks(readLine()!!.toInt())
    println(totalDesks)
}

fun calculateNumberOfDesks(students: Int): Int {
    return students / 2 + students % 2
}