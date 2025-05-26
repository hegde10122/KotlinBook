package misc

import java.math.BigInteger
import java.math.BigDecimal

fun main(){

    val big1 = BigInteger("123456789012345678901234567890")
    val big2 = BigInteger("98765432109876543210")

    val sum = big1 + big2      // Using operator overloading
    val product = big1 * big2

    println("Sum: $sum")
    println("Product: $product")


    println(2147483647 + 1) // -2147483648

    val f = 10.0F
    val ff = f.toBigDecimal()

    println(ff)

    val bigOverflow = 2147483647

    val bigNumber = bigOverflow.toBigInteger() + BigInteger("1")

    println(bigNumber) //produces correct result 2147483648


    val basic1 = BigDecimal("1.24")
    val basic2 = BigDecimal("4.98")
    println(basic1 + basic2) // 6.22
    println(basic1 - basic2) // -3.74
    println(basic1 * basic2) // 6.1752
    println(basic1 / basic2) // 0.25


}