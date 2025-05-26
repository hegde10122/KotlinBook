package misc

fun main(){

    val num: Any = 42
    val str: Any = "Hello, Kotlin!"

    comparison(num)
    comparison(str)


}

fun comparison(zz : Any?){

    when(zz){
        is Int -> {

            if(zz > 50){
                println(zz * 2)
            }
            println("$zz is a number")
            iteration(zz)
        }
        is Long -> {
            println("$zz is a number")
        }
        is String ->{
            if(zz.length < 15){
                println("String length is ${zz.length}")
            }
        }
        else ->{
            println("No specific condition met")
        }
    }

}

fun iteration(num:Int){

    var counter = 0
    while(counter < 4){

        if(counter % 2 == 0){
            println("Iteration $counter is even")
        }
        else{
            println("Iteration $counter is odd")
        }

        counter++
    }
}

/*
If num is of type Int and greater than 50, multiply it by 2 and print the result.
If num is of type Int or Long, concatenate it with the string "is a number" and print the result.
If str is of type String and its length is less than 15, print the length of the string.
If none of the above conditions are met, print "No specific condition met".
Additionally, use a while loop to iterate four times and perform the following:
If the loop iteration is even, print "Iteration {index} is even".
If the loop iteration is odd, print "Iteration {index} is odd".


Instructions
Use the when statement for conditional checks.
Utilize type checks (is operator) to determine the type of variables.
Use as? for safe casting if the type is uncertain.
Use if-else statements for conditional checks within the loop.
Print the results of each operation and loop iteration in a clear and concise format.
**/