fun main() {
    // -15 < n <= 12
    // 14 < n < 17
    // 19 <= n < (inf)
    val n = readLine()!!.toInt()
    println(
        if (-15 < n && n <= 12 || 14 < n && n < 17 || 19 <= n) {
            "True"
        } else {
            "False"
        }
    )
}