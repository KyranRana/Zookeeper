fun main() {
    val liquidDensity = readLine()!!.toDouble()
    val heightOfColumn = readLine()!!.toDouble()

    println(liquidDensity * 9.8 * heightOfColumn)
}