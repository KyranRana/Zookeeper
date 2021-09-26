fun main() {
    var sum = 0
    var next: Int

    do {
        next = readLine()!!.toInt()
        sum += next
    } while (next != 0)

    println(sum)
}