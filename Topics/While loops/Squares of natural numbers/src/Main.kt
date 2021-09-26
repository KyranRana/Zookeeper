fun main() {
    val n = readLine()!!.toInt()

    var i = 1
    var j = 3
    while (i <= n) {
        println(i)
        i += j
        j += 2
    }
}