fun main() {
    val n = readLine()!!.toInt()

    var positive = 0

    repeat(n) {
        if (readLine()!!.toInt() > 0) {
            positive++
        }
    }

    println(positive)
}