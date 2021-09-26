fun main() {
    val cups = readLine()!!.toInt()
    val weekend = readLine()!!.toBoolean()

    println(!weekend && cups >= 10 && cups <= 20 || weekend && cups >= 15 && cups <= 25)
}