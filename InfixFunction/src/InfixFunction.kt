fun main(){
    val num = 3
    //val str = num.strplus("kotlin")
    val str = num strplus "kotlin"
    println(str)
}

infix fun Int.strplus(x: String): String {
    return "$x version $this"
}