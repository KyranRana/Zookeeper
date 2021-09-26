fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val h = readLine()!!.toInt()

    println(
        if (h in a..b) {
            "Normal"
        } else if (h < a) {
            "Deficiency"
        } else {
            "Excess"
        }
    )
}