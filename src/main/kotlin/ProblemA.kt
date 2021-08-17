class ProblemA {

    fun main() {
        val t: Long = readLong()

        for (i in 1..t) {
            val stdin: List<Long> = readListLong()
            val a: Long = stdin[0]
            val b: Long = stdin[1]
            val k: Long = stdin[2]

            if (k % 2 == 0L) {
                println((k / 2) * (a - b))
            } else {
                println(((k - 1) / 2) * (a - b) + a)
            }
        }
    }
}