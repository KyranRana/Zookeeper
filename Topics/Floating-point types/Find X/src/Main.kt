fun main() {
    // a * x + b = c
    // a * x     = c - b
    // x         = (c - b) / a

    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()
    val c = readLine()!!.toDouble()

    println((c - b) / a)
}