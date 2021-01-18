private class PrivateText{
    private var i = 1;
    private fun privateFunc(){
        i += 1
        println(i)
    }

    fun access(){
        privateFunc()
    }
}

class OtherClass {
    // val pc = PrivateText 공개 생성 불가

    fun test() {
        val pc = PrivateText()
        pc.access()
    }
}

fun main() {
    val pc = PrivateText()

    // pc.i = 2         불가능
    // pc.privateFunc() 불가능

    pc.access()
}