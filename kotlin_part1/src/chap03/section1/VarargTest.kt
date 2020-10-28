package chap03.section1

fun normalVarargs(vararg a: Int) {  // vararg 원하는 인자만큼 받을수있음 가변인자라고 함.
    for (num in a) {
        print("$num ")
    }
}

fun main() {
    normalVarargs(1)

    normalVarargs(1, 2, 3, 4, 123)
}