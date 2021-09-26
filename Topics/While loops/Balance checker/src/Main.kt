import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var money = scanner.nextInt()

    var enough = true
    while (scanner.hasNextInt()) {
        val purchase = scanner.nextInt()

        if (money - purchase >= 0) {
            money -= purchase
        } else {
            println("Error, insufficient funds for the purchase. You have $money, but you need $purchase.")
            enough = false
            break
        }
    }

    if (enough) {
        print("Thank you for choosing us to manage your account! You have $money money.")
    }
}