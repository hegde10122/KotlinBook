package chars

fun main(){


    val text = "Kotlin is awesome!"
    println(text.length)            // 18
    println(text.uppercase())       // KOTLIN IS AWESOME!
    println(text.contains("some"))   // true

    val multiLine = """
    This is line 1
    This is line 2
    This is line 3
    Indents preserved
    """.trimIndent()

    println(multiLine)


    val name = "Python"
    val surname = "Machine Learning"
    val age = 64

    val fullNameUpper =
        "${name.uppercase()} ${surname.uppercase()} ($age)"
    println(fullNameUpper)

    println("😃")  // 😃
    println( "\uD83D\uDC4B") // 👋
    println("\uD83C\uDDF5\uD83C\uDDF1") //🇵🇱
}

