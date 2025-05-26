package misc

fun main(){

    /**
    To define a number using the hexadecimal numeral system, start with 0x.
    To define a number using the binary numeral system, start with 0b.
    The octal numeral system is not supported.
     * */

    val hexBytes = 0xB4_E6_FE_EF
    println(hexBytes) // 3035037423
    val bytes = 0b01010000_01101101_11101000_10011010
    println(bytes) // 1349380250

    //All basic types that represent numbers are subtypes of the Number type.

    val i: Int = 681
    val b: Byte = 121
    val l: Long = 785L

    val num1: Number = i
    val num2: Number = b
    val num3: Number = l

    println("number 1: $num1")
    println("number 2: $num2")
    println("number 3: $num3")

    //TRANSFORMATION FUNCTIONS --- explicit type conversion --- Implicit conversion does not happen in kotlin
    val byte: Byte = 111
    val lll: Long = byte.toLong()
    val fff: Float = lll.toFloat()
    val iii: Int = fff.toInt()
    val ddd: Double = iii.toDouble()
    println("byte: $byte")
    println("long: $lll")
    println("float: $fff")
    println("Integer: $iii")
    println("double: $ddd")


}