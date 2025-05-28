package functions

fun main(){
//    for (i in 1..5) {
//        if (i == 3) return  // exits the function main including the for loop
//        println(i)
//    }
    println("You will never see me printed because of the return statement !!")


    outer@ for (i in 1..3) {
        for (j in 1..3) {
            if (j == 2) break@outer  // breaks out of the outer loop
            println("i = $i, j = $j")
        }
    }


}
