package classes

fun main(){

val person = Person()

    println(person.age)
}

class Person {
    var age: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                println("Age can't be negative")
            }
        }

    var isAdult: Boolean = false
        get() = age >= 18


}
