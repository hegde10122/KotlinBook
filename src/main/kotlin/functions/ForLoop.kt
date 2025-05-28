package functions

fun main(){


    val items = listOf("A", "B", "C")
    val iterator = items.iterator()

    while (iterator.hasNext()) {
        val item = iterator.next()
        println(item)
    }


//    for (i in 1 until 5) {
//        println(i)
//    }
//
//    for (i in 5 downTo 1) {
//        println(i)
//    }

//    for (i in 1..10 step 2) {
//        println(i)
//    }


    for (i in 10 downTo 1 step 3) {
        println("$i ")
    }

    val veggies = listOf("Cabbage", "Brinjal", "Spinach")

    for ((index, vegetable) in veggies.withIndex()) {
        println("Vegetable #$index is $vegetable")
    }

    for (i in 1..7) {
        if (i == 4) break
        println("i = $i")
    }

    for (i in 1..5) {
        if (i == 3) continue  // skips printing 3
        println(i)
    }
}