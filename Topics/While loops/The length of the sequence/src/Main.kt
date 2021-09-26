fun main() {
    var length = 0
    var next: Int

    do {
        next = readLine()!!.toInt()
        length++
    } while (next != 0)

    println(length - 1)
}