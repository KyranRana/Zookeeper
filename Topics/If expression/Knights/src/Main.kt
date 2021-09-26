import java.util.*
import kotlin.math.abs

fun main() {
    val scanner = Scanner(System.`in`)

    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()

    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()

    val xDiff = abs(x2 - x1)
    val yDiff = abs(y2 - y1)

    println(if (xDiff == 2 && yDiff == 1 || xDiff == 1 && yDiff == 2) "YES" else "NO")
}