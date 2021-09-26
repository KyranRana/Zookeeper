fun main() {
    val limit = readLine()!!.toInt()

    var n = 1
    var i = 0
    while (i + n < limit) {
        print("$n ".repeat(n))
        i += n
        n++
    }

    print("$n ".repeat(limit - i))
}