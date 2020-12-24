fun main() {
    var str1: String?

    str1 = null

    //val len = if (str1 != null) str1.length else -1
    val len = str1?.length ?: -1

    // (?.) null이면 실행 안시킴
    // (!!.) null일리 없다라는 가정을 넣음 ->널 들어오면 오류남
    println("str1: $str1, length: $len")
}