package functions

fun formatPersonDisplay(name:String? = null,surname:String? = null,age:Int? = null):String {

    var result = ""
    if(name!=null){
        result += name
    }

    if(surname!=null){
        result += " $surname"
    }

    if(age!=null){
        result += " ($age)"
    }


return result.trim()
}

fun main(){


    formatPersonDisplay()
    println(formatPersonDisplay("John", "Smith", 42))
    println(formatPersonDisplay("Alex", "Simonson"))
    println(formatPersonDisplay("Peter", age = 25))
    println(formatPersonDisplay(surname = "Johnson", age = 18))
}