class Box<T>(a: T) {
    var name = a
}

fun main() {
    val box1 = Box(1)
    val box2 = Box("Kildong")

    println(box1.name)
    println(box2.name)
}