fun main() {
    val number = readLine()!!.toInt()

    var totalSum = number % 10
    totalSum += number / 10 % 10
    totalSum += number / 100 % 10
    println(totalSum)
}