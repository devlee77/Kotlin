fun main() {
    data class Person(var name: String, var skills: String)
    val person = Person("Kildong", "Kotlin")

    val a = person.let {
        it.skills = "java"
        "Success"
    }
    println("a $a")
    println("person $person")

    val b = person.also {
        it.skills = "heelo"
        "Success"
    }
    println("b $b")
    println("person $person")
}