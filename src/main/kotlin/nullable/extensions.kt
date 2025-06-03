package nullable

fun String?.printLengthOrDefault() {
    if (this == null) {
        println("String is null. Default length: 0")
    } else {
        println("Length of string: ${this.length}")
    }


    /*
    Otherwise, return information about the user in the following format: "User $name is $age years old, email: $email".


    * */
}

fun main() {
    val name: String? = "Kotlin"
    val unknown: String? = null

    name.printLengthOrDefault()     // Prints: Length of string: 6
    unknown.printLengthOrDefault()  // Prints: String is null. Default length: 0
}
