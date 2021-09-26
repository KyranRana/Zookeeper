fun main() {
    val invitation = readLine().toBoolean() // read other value in the same way
    val broughtGift = readLine().toBoolean()

    println(invitation && broughtGift)
}