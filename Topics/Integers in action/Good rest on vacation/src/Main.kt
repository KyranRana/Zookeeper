fun main() {
    val durationInDays = readLine()!!.toInt()
    val totalFoodCostPerDay = readLine()!!.toInt()
    val oneWayFlightCost = readLine()!!.toInt()
    val oneNightCost = readLine()!!.toInt()

    var totalSum = oneWayFlightCost * 2
    totalSum += durationInDays * totalFoodCostPerDay
    totalSum += (durationInDays - 1) * oneNightCost
    print(totalSum)
}