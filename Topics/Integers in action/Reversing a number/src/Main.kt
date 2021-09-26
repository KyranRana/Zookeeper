fun main() {
    val number = readLine()!!.toInt()

    print(number % 10)
    print(number / 10 % 10)
    print(number / 100 % 10)
}