package chap03.section1

fun sum(a: Int, b: Int = 5) = a + b // = 5는 디폴트 값으로 값이 안들어오면 이걸로 사용됨

fun max(a: Int, b: Int) = if (a > b) a else b

fun outfunc(name: String) = println("Name: $name")

fun main() {    //최상위(Top-level) 함수 - 여기 안에 있는 함수들은 이 위에 있든 안에있든 상관없이 사용할수있다.
    val result1 = sum(2, 3)
    val result3 = sum(2) //b에만 넣고 싶으면 (b = 2)로 쓰면됨
    val a = 3
    val b = 5

    val result2 = max(a, b)

    outfunc("kildong")
    println(result1)
    println(result2)
    println(result3)
}