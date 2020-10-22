package chap02.section3

fun main() {
    var str1: String?
    str1 = null
    val len = str1?.length ?: -1


    // ?. 은 이게 널이면 뒷부분을 실행하지 않음
    // !!. 는 널일리 없다. 널이더라도 체크한다.
    println("str1: $str1, length: $len")
}