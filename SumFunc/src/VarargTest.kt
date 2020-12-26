fun main(){
    normalvarargs(1)
    println()
    normalvarargs(1, 2, 3, 4)
}

//여러개를 받기 위해 vararg를 사용하면된다.
fun normalvarargs(vararg a: Int) {
    for (num in a) {
        print("$num ")
    }
}