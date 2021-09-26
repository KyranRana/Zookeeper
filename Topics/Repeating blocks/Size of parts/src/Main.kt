fun main() {
    val n = readLine()!!.toInt()

    var larger = 0
    var smaller = 0
    var perfect = 0

    repeat(n) {
        when (readLine()!!.toInt()) {
            1 -> larger++
            -1 -> smaller++
            else -> perfect++
        }
    }

    println("$perfect $larger $smaller")
}