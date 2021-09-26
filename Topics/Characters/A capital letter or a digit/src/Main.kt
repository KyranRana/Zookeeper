fun main() {
    val char = readLine()!!.first()
    println(char.isUpperCase() || char.isDigit() && char != '0')
}