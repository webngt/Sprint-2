class ProblemD {

    fun main() {
        val t: Int = readInt()

        for (i in 1..t)
        {
            val n: Int = readInt()
            val customersCoins: List<Long> = readListLong()
            val sortedCustomersCoins = customersCoins.sorted()
            var possibleProfit: Long = sortedCustomersCoins[0] * n
            var prevNumber: Long = sortedCustomersCoins[0]

            for (j in 1 until n)
            {
                if (sortedCustomersCoins[j] == prevNumber)
                    continue
                else {
                    prevNumber = sortedCustomersCoins[j]
                    possibleProfit = if (possibleProfit < (n - j) * sortedCustomersCoins[j])
                        (n - j) * sortedCustomersCoins[j]
                    else
                        possibleProfit
                }
            }
            println(possibleProfit)
        }
    }
}