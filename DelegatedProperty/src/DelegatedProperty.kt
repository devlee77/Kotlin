import kotlin.properties.Delegates

class User{
    var name: String by Delegates.observable("Noname"){
        property, oldValue, newValue ->
        println("old: $oldValue, new: $newValue")
        println(property)
    }
}

fun main() {

    val user = User()

    user.name = "kildong"
    user.name = "doluy"
}