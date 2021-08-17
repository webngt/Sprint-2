class ProblemB {

    fun main() {
        val t = readInt()

        for (i in 1..t) {
            val stdin = readListInt()
            val n = stdin[0]
            val k = stdin[1]
            val charCode = 'a'.code
            var counter = 0

            for (j in 0 until n) {
                print((charCode + counter).toChar())
                if (counter < k - 1)
                    counter++
                else
                    counter = 0
            }
            println()
        }
    }
}
