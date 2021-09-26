fun main() {
    val naturalNumber = readLine()!!.toInt()
    print(naturalNumber + (2 - naturalNumber % 2))
}