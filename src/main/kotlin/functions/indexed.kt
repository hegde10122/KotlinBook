package functions

fun main(){

    val colors = listOf("Red","Green","Blue","Black","White")
    println(colors.indices)

    for (j in colors.indices){
        println("Color value at index $j is ${colors[j]}")
    }

    val fruits = listOf("Jackfruit", "Sapota", "Strawberry")

    fruits.forEachIndexed { index, fruit ->
        println("Fruit at index $index is $fruit")
    }
}