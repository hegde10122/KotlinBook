package functions

fun main(){

 var a0 =   calculateSumOfSquares(0)
 var a1 =   calculateSumOfSquares(1)
 var a2 =   calculateSumOfSquares(2)
 var a3 =   calculateSumOfSquares(3)
 var a4 =   calculateSumOfSquares(4)

    println(a0)
    println(a1)
    println(a2)
    println(a3)
    println(a4)

    var a5 =   calculateSumOfEven(10)
    var a6 =   calculateSumOfEven(12)
    var a7 =   calculateSumOfEven(20)
    var a8 =   calculateSumOfEven(3)
    var a9 =   calculateSumOfEven(4)

    println(a5)
    println(a6)
    println(a7)
    println(a8)
    println(a9)


    var b1 = countDownByStep(5,1,2)
    println("Countdown $b1")
}

/**
println("Countdown from 1 to 1 by step 1: ${countDownByStep(1, 1, 1)}") // 1
println("Countdown from 5 to 1 by step 2: ${countDownByStep(5, 1, 2)}") // 5, 3, 1
println("Countdown from 10 to 1 by step 3: ${countDownByStep(10, 1, 3)}") // 10, 7, 4, 1
println("Countdown from 15 to 5 by step 5: ${countDownByStep(15, 5, 5)}") // 15, 10, 5
println("Countdown from 20 to 2 by step 3: ${countDownByStep(20, 2, 3)}") // 20, 17, 14, 11, 8, 5, 2
println("Countdown from 10 to 4 by step 3: ${countDownByStep(10, 4, 3)}") // 10, 7, 4
println("Countdown from -1 to -1 by step 1: ${countDownByStep(-1, -1, 1)}") // -1
println("Countdown from -5 to -9 by step 2: ${countDownByStep(-5, -9, 2)}") // -5, -7, -9
 * */

fun calculateSumOfEven(n: Int): Int {
    // Write your code here
    var sum = 0
    for (j in 0..n){
        if( j % 2 == 0){

            sum+= j
        }
    }
    return sum
}

fun calculateSumOfSquares(n: Int): Int {
    // Write your code here
    var sum = 0
    for (j in 0..n){
       val squares = j * j
       sum +=squares
    }
    return sum
}

fun countDownByStep(start: Int, end: Int, step: Int): String {
//The countDownByStep function should take three integers: start, end, and step,
// and return a string representation of
// the numbers from start down to end, with each step being step units apart.
var result = ""
for(k in start downTo end step step) {
result += k

}


    return result
}