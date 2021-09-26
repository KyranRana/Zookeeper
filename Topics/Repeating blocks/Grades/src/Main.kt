fun main() {
    val n = readLine()!!.toInt()
    var (a, b, c, d) = Array(4) { 0 }

    repeat(n) {
        when (readLine()!!.toInt()) {
            2 -> d++
            3 -> c++
            4 -> b++
            5 -> a++
        }
    }

    println("$d $c $b $a")
}