var global = 10

fun main() {

    //localFunc() 여기는 실행안됨
    fun localFunc() {
        println("localFunc1")
    }

    localFunc()

    global = 15
    val local = 15
    println("global $global")
    userFunc()
    println("final - global: $global, local: $local")
}

fun userFunc() {
    global = 20
    val local = 20
    println("userFunc - global: $global, local: $local")
}