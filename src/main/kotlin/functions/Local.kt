package functions

fun greetUser(name: String) {

    fun isValidName(name: String): Boolean {
        return name.isNotBlank()
    }

    if (isValidName(name)) {
        println("Hello, $name!")
    } else {
        println("Invalid name.")
    }
}

fun main() {
    greetUser("Asif iqbal")  // Hello, Asif iqbal!
    greetUser("  ")     // Invalid name.
}