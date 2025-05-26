package misc

fun main(){


    val hexBytes = 0xA4_D6_FE_FE

    println(hexBytes)



    val a: Int = 5
    val b: Double = 7.5
    val c: Long = 10L

    val r1 = a +b

    println("Result 1 (a + b): ${r1}")

    val r2 = r1 * c

    println("Result 2 (Result 1 * c): ${r2}")

    val r3 = r2.toInt()

    println("Result 3 (Convert Result to Int): ${r3}")

    val r4 = r3 - b

    println("Result 4 (Result 3 - b): ${r4}")

    val r5 = r4 / a

    println("Result 5 (Result 4 / a): ${r5}")

    val r6 = r5 % c

    println("Result 6 (Result 5 %c): ${r6}")
    /**
    Add a and b.

    Multiply the result from operation 1 by c.

    Convert the result from operation 2 to an integer.

    Subtract b from the result of operation 3.

    Divide the result from operation 4 by a.

    Calculate the remainder when the result from operation 5 is divided by c




    Result 1 (a + b): 12.5
    Result 2 (Result 1 * c): 125.0
    Result 3 (Convert Result 2 to Int): 125
    Result 4 (Result 3 - b): 117.5
    Result 5 (Result 4 / a): 23.5
    Result 6 (Result 5 % c): 3.5
     * */
}