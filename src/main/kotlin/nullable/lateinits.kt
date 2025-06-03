package nullable

lateinit var name: String  // Declare a lateinit variable

var nickname: String? = null  // Declare a nullable variable

fun main() {
    // Check if 'name' is initialized before using it
    if (::name.isInitialized) {
        println("Name (lateinit): $name")
    } else {
        println("Name is not initialized yet.")
    }

    // Assign a value to lateinit var
    name = "alinama"
    println("Now name is: $name")

    // Nullable variable before assignment
    println("Nickname (nullable): ${nickname ?: "No nickname"}")

    // Assign value to nullable variable
    nickname = "cudgels"
    println("Updated nickname: ${nickname ?: "No nickname"}")
}
