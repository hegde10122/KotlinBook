package functions

fun greet(name:String){

    println(name)


}



fun main(){

    var result = greet("Balma")
    println(result)

    employeeList("Amanna", "Jahandad", "Manoj", "Chetty", "Darda","Shoewala")

    greetFestival(92,"Amanna", "Jahandad", "Manoj", "Chetty", "Darda","Shoewala")
}

fun employeeList(vararg names: String) : Unit {

    for (emp in names){
        println("Employee: $emp")
    }
}

fun greetFestival(cakeSize:Int,vararg names: String,salary : Int = 1000,girth : Int = 67,sciwar:Int = 88) : Unit {

    for (emp in names){
        println("Festival time $emp $cakeSize $sciwar")
    }
}

