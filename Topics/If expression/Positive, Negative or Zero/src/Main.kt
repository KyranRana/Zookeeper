fun main() {
    val number = readLine()!!.toInt()
    println(
        if (number < 0) {
            "negative"
        } else if (number > 0) {
            "positive"
        } else {
            "zero"
        }
    )
}