fun main() {
    var total = 0

    for (num in 0..100 step 2) {  //홀수합
        total += num
    }
    println("total: $total")
}