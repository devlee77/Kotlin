import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsResourceLoader

open class Bird(var name: String, var wing: Int, var beak: String){
    open fun fly(){
        println("Fly")
    }
}

class Lark(name: String, wing: Int, beak: String): Bird(name, wing, beak){
    fun singHitone(){
        println("sing hitone")
    }

    override fun fly(){
        println("Quick fly")
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

    override fun fly(){
        super.fly()
        println("Slow fly")
    }
}

fun main() {
    val lark:Bird = Lark("mylark", 2, "short")
    val parrot:Bird = Parrot("mylark", 2, "short", "English")

    println("lark - name: ${lark.name}")
    //println("parrot - name: ${parrot.name}, lang: ${parrot.language}")

    //lark.singHitone()
    lark.fly()

    //parrot.speak()
    parrot.fly()
}