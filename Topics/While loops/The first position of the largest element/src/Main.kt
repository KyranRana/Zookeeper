import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    var firstPositionOfMax = 1
    var maxNumber = Integer.MIN_VALUE

    var position = 1
    while (scanner.hasNextInt()) {
        val next = scanner.nextInt()
        if (next > maxNumber) {
            firstPositionOfMax = position
            maxNumber = next
        }
        position++
    }

    println("$maxNumber $firstPositionOfMax")
}