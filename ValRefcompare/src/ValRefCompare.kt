fun main() {
    // 변수의 값이 -128 ~ 127이라면 코틑린은 캐시에 이값을 담기 때문에
    // 참조값도 같게 나옴
    val a: Int = 128
    val b = a

    println(a == b) //true
    println(a === b) //true

    val c: Int? = a
    val d: Int? = a
    val e: Int? = c

    println(c == d) //true
    println(c === d) //false
    println(c === e) //true
}