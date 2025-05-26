package misc

import kotlin.random.Random

fun main(){

    var roll: Int
    do {
        roll = Random.nextInt(1, 7)
        println("You rolled: $roll")
    } while (roll != 6)

    println("You got a 6! Game over.")

}