package nullable

fun main(){


    val nullableString: String? = "Hello, Kotlin"
    val nullString: String? = null

    printLength(nullableString) // Output: Length is 13
    printLength(nullString) // Text is null
}

fun printLength(text: String?) {
    if (text != null) {
        println("Length is ${text.length}") // smart-casted to String (non-null)
    } else {
        println("Text is null")
    }
}