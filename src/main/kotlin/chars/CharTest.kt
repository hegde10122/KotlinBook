package chars

fun main(){

    val letter: Char = 'A'
    val digit: Char = '7'
    val symbol: Char = '$'

    println('Z')

    val ch = 'd'

//Common Char Methods
    println(ch.isDigit())     // false
    println(ch.isLetter())    // true
    println(ch.uppercaseChar()) // D

    println('A'.code)

    //UNICODE
    println('\u00B6') // ¶
}