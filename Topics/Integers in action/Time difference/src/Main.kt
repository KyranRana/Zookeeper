fun main() {
    val firstHour = readLine()!!.toInt()
    val firstMinute = readLine()!!.toInt()
    val firstSecond = readLine()!!.toInt()

    val secondHour = readLine()!!.toInt()
    val secondMinute = readLine()!!.toInt()
    val secondSecond = readLine()!!.toInt()

    var totalSeconds = secondSecond - firstSecond
    totalSeconds += secondMinute * 60 - firstMinute * 60
    totalSeconds += secondHour * 3600 - firstHour * 3600
    println(totalSeconds)
}