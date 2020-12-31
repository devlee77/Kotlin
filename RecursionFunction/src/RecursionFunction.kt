fun main() {
    val numver = 4
    val result: Long

    result = factorial(numver)
    println("Factorial: $numver -> $result")
}

fun factorial(n: Int): Long {
    return if (n == 1) n.toLong() else n * factorial(n - 1)
}