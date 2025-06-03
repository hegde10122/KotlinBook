package classes

class Holder {
    val v1: Int get() = calculate("v1")
    val v2: Int = calculate("v2")

    private fun calculate(propertyName: String): Int {
        println("Calculating $propertyName")
        return 42
    }
}

class User(
    var name: String = "",
    var surname: String = "Apathy",
)



fun main() {
    val h1 = Holder()
    val h2 = Holder()
    println(h2.v1)
    println(h2.v1)
    println(h2.v2)
    println(h2.v2)

    val user = User("Jason")
    println(user.name)
    println(user.surname)
}