//지수부와 가수부의 제한을 알수있는 파트
fun main() {
    var num: Double = 0.1

    for (x in 0..999) {
        num += 0.1
    }
    println("num: $num")
}