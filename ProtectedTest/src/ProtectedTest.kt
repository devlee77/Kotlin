open class Base {
    protected var i = 1
    protected fun protectedFunc(){

    }
}

class Derived : Base() {
    var j = 1 + i
    fun derivedFunc() : Int {
        protectedFunc()
        return i
    }
}

class Other {
    fun other() {
        val base = Base()
    }
}

fun main() {
    val base = Base()
//    base.i
//    base.protectedFunc

    val derived = Derived()
    derived.j = 3
    derived.derivedFunc()
}