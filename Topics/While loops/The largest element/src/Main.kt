fun main() {
    var maxNumber = 0
    var next: Int

    do {
        next = readLine()!!.toInt()
        maxNumber = maxOf(maxNumber, next)
    } while (next != 0)

    println(maxNumber)
}