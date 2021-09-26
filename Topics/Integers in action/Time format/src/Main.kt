fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line
    val totalMinutes = totalSeconds % 60
    val totalHours = totalMinutes / 60

    print(totalHours)
    print(':')
    print(totalMinutes)
    print(':')
    print(totalSeconds)
}