package boolean

fun main(){

val isEmployee : Boolean = true //explicit declaration
var isWarm = false //type inferred

 var a = true
 var b = false

    println("AND operation - Logical AND (short-circuit) ${a && b}")
    println("OR operation - Logical OR ${a || b}")
    println("NOT operation ${!a}")
    println("Logical XOR / exclusive OR operation ${a.xor(b)}")

    //RELATIONAL OPERATORS
    println(10 > 21) // false
    println(21 > 11) // true
    println(11 > 21) // false

    println(21 < 21) // false
    println(21 < 11) // false
    println(11 < 21) // true

    println(21 >= 21) // true
    println(21 >= 11) // true
    println(11 >= 21) // false

    println(21 <= 21) // true
    println(21 <= 11) // false
    println(11 <= 21) // true
}