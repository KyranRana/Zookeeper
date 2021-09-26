fun main() {
    val n = readLine()!!.toInt()

    var maxElement = 0

    repeat(n) {
        val next = readLine()!!.toInt()

        if (next % 4 == 0) {
            maxElement = maxOf(maxElement, next)
        }
    }

    print(maxElement)
}