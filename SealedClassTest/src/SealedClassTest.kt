sealed class Result {
    open class Success(val message: String): Result()
    class Error(val code: Int, val message: String) : Result()
}

fun main() {
    val result = Result.Success("success")
    println(eval(result))
}

//result를 상태검사해주는 함수
fun eval(result: Result): String = when (result) {
    is Result.Success -> result.message
    is Result.Error -> result.message
}