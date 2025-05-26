package misc

fun main(){

    var x = 123
    var z = "ABC"

    println(x is Int) // true
    println(z is String) // true


    var y = "Pinky"
    println(y !is String) // false

    if(y !is String){
        println("Support")
    }
    else{
        println("Big Fall") //this will be printed
    }

    var i: Number = 123

    //We know that i is an integer. We can use explicit casting
    //and "down" cast i from Number to Int

    var h = (i as Int) + 55
    println("Value of integer after down-casting from Number: $h")

    //Similarly we have up casting
    //We have a Double j as follows

    var j : Double = 5.23

    var k : Number = j // Double is "up" casted to a Number

    //Number is a supertype of types like Long,Double,Float

    println("Value of number after up-casting from Double: $k")

}