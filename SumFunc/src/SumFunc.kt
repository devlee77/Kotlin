//합을 구하는 함수/ 디폴트 값이 있음 인자가 안들어오면 디폴트 사용
// fun sum(a: Int, b: Int = 5) = a + b   이것과 같은 의미이다
fun sum(a: Int, b: Int): Int {
    return a + b
}

//큰수를 반환하는 함수
// fun max(a: Int, b: Int) = if (a > b) a else b
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

//반환이 없는 함수 (Unit생략 가능)
// fun outfunc(name: String) = println("Name: $name")
fun outfunc(name: String): Unit {
    println("Name: $name")
}

fun main() { //최상위(top-level) 함수
    val result1 = sum(2, 3)
    val result2 = sum(6, 7)

    println(result1)
    println(result2)

    val a = 3
    val b = 5

    val result3 = max(a, b)
    println(result3)

    outfunc("tjdcks")
}