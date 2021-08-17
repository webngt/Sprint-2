import kotlin.math.abs

class ProblemC {

    fun main() {
        val n = readInt()
        val stdin = readListInt()
        val sortedStdin = stdin.sorted()
        var problemsToSolve = 0

        for (i in 1..n step 2) {
            problemsToSolve += abs(sortedStdin[i] - sortedStdin[i-1])
        }

        println(problemsToSolve)
    }
}