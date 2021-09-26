fun main() {
    var totalDesks = numberOfDesks(readLine()!!.toInt())
    totalDesks += numberOfDesks(readLine()!!.toInt())
    totalDesks += numberOfDesks(readLine()!!.toInt())
    println(totalDesks)
}

fun numberOfDesks(students: Int): Int = students / 2 + students % 2