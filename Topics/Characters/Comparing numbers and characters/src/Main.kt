fun main() {
    val digit = readLine()!!.toInt()
    val char = readLine()!!.first()

    println(char.code == digit)
}