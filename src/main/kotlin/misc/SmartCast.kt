package misc

fun lengthIfCharSequence(a: Any?): Int {
    if (a is CharSequence) {
        println("a is a CharSequence")
        return a.length
    } else {
        println("a is not a CharSequence or is null")
    }
    return 0
}

fun main() {
    val stringVal = "Hello"
    val stringBuilderVal = StringBuilder("Karan")
    val numberVal = 48
    val nullVal: Any? = null

    println("String Length: ${lengthIfCharSequence(stringVal)}")
    println("StringBuilder Length: ${lengthIfCharSequence(stringBuilderVal)}")
    println("Int Length: ${lengthIfCharSequence(numberVal)}")
    println("Null Length: ${lengthIfCharSequence(nullVal)}")
}