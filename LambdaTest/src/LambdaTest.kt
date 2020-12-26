fun main() {
    val result: Int

    // 일반 변수에 람다식 할당
    //val multi = { a: Int, b: Int -> a * b }
    val multi: (a: Int, b: Int) -> Int = { a, b -> a * b }

    // 만약 print만하고싶으면 -> Int를 Unit으로 변경
    val multi: (a: Int, b: Int) -> Int = { a, b ->
        println("a: $a, b: $b")
        a * b
    }

    //람다식 안에 람다식이 있는 경우
    val nestedLambda: () -> () -> Unit = { { println("nestedLambda") } }

    // 람다식이 할당된 변수는 함수처럼 사용 가능
    result = multi(10, 20)
    println(result)
}