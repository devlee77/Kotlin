fun main() {

    var x = readLine()!!.toInt()

    for (i in 1..x) {
        for (j in 1..x - i) print(" ")
        for (z in 1 until i * 2) print("*")
        println();
    }
}