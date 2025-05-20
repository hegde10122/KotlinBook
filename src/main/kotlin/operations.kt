fun main() {

    val i1 = 44
    val i2 = 34
    println(i1 + i2) // 78
    println(i1 - i2) // 10
    println(i1 * i2) // 1496
    println(i1 / i2) // 1

    val d1 = 1.66
    val d2 = 2.5
    println(d1 + d2) // 4.16
    println(d1 - d2) // -1.16
    println(d1/d2)

    val x1 = 6
    val x2 = 5

    println(x1 / x2)
    println(x1.toDouble() / x2)

    /**
    Points to remember

    1)
    Notice, that the correct result of 1.66 / 2.5 should be 0.664, not 0.6639999999999999
    due to limitations in floating-point representation leading to rounding errors.
    To ensure accurate decimal calculations, consider alternative data types like BigDecimal.

     2)
    when we divide an Int by an Int, the result is also Int, so the decimal part is lost.
    The problem with x1 / x2 in the above snippet is evident.
    The solution is to first convert an integer into a floating-point representation
    and then divide it. so we can write x1 = x1.toDouble() before dividing it.
     * */


    //REMAINDER OPERATOR
    println(10 % 3)  // Output: 1
    println(20 % 4)  // Output: 0
    println(7 % 5)   // Output: 2

    println(-10 % 3)    // -1
    println(10 % -3)    // 1
    println(-10 % -3)   // -1

    var i = 2
    println(i) // 2
    i += 10
    println(i) // 12
    i -= 5
    println(i) // 7
    i *= 3
    println(i) // 21
    i /= 2
    println(i) // 10
    i %= 4
    println(i) //2
}