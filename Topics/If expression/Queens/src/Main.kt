import java.util.*
import kotlin.math.abs

fun main() {
    val scanner = Scanner(System.`in`)

    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()

    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()

    println(
        if (x1 == x2 || y1 == y2 || abs(y2 - y1) == abs(x2 - x1)) {
            "YES"
        } else {
            "NO"
        }
    )
}