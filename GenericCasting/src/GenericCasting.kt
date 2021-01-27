open class Parent

class Child: Parent()

class Cup<T>

fun main() {
    val obj1 = Parent()
    val obj2 = Child()

    val obj3: Cup<Parent> = Cup<Parent>()
    val obj4: Cup<Child> = Cup<Child>()
}