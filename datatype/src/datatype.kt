fun main() {

    //val은 한번정하면 바꿀 수 없음
    val username: String = "Kildong"

    //바꾸고 싶으면 var
    // [: Int]는 생략 가능 -> 자료형 추론해서 할당해줌
    var count: Int = 3
    count = 4

    println("username: $username, count: $count")
}