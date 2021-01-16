import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsResourceLoader

open class Bird(var name: String, var wing: Int, var beak: String){
    fun fly(){
        println("Fly")
    }
}

class Lark(name: String, wing: Int, beak: String): Bird(name, wing, beak){
    fun singHitone(){
        println("sing hitone")
    }
}

class Parrot:Bird{
    var language: String
    constructor(name: String, wing: Int, beak: String, language: String) : super(name, wing, beak){
        this.language = language
    }

    fun speak(){
        println("speak: $language")
    }
}

fun main() {
    val lark = Lark("mylark", 2, "short")
    val parrot = Parrot("mylark", 2, "short", "English")

    println("lark - name: ${lark.name}")
    println("parrot - name: ${parrot.name}, lang: ${parrot.language}")

    lark.singHitone()
    lark.fly()

    parrot.speak()
    parrot.fly()
}