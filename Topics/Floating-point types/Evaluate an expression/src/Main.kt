fun main() {
    val n = readLine()!!.toDouble()

    var totalSum = n * n * n
    totalSum += n * n
    totalSum += n + 1
    println(totalSum)
}