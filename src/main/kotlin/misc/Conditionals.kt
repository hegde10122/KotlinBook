package misc

fun main() {

    val a = 11
    val b = 22

    val max = if (a > b) a else b

    println("Max is $max") // Output: Max is 22

    //The last expression inside each block becomes the result

    val max2 = if (a > b) {
        println("a is greater")
        a //this is the last expression or the result
    } else {
        println("b is greater")
        b  //this is the last expression or the result
    }

    println(max2) //max2 is 22

    println("Is it going to rain tonight ?")
    val probability = 70
    if (probability < 40) {
        println("No")
    } else if (probability <= 80) {
        println("Likely")
    } else if (probability < 100) {
        println("Yes")
    } else {
        println("Rain gods come here")
    }


    val grade = 85

    val result = when {
        grade >= 90 -> "A"
        grade >= 80 -> "B"
        grade >= 70 -> "C"
        else -> "F"
    }

    println("Grade is $result")

    val x = 2
    when (x) {
        1 -> println("x is 1")
        2 -> println("x is 2")
        3 -> println("x is 3")
        else -> println("x is neither 1, 2, nor 3")
    }

    val day = 5

    when (day) {
        1, 7 -> println("Weekend")
        in 2..6 -> println("Weekday")
        else -> println("Invalid")
    }


    var tt : Number = 5.12

    var kk = tt.toInt()

    println(kk)

}