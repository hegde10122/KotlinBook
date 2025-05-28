package functions

fun main(){

    /** */
    val productPrices = mapOf(
        "Laptop" to 999.99,
        "Phone" to 699.49,
        "Tablet" to 459.00,
        "Monitor" to 249.99,
        "Keyboard" to 89.99
    )

    for ((product,price) in productPrices){
        println("Key $product with value $price")
    }


    val countries = mapOf(
        "IN" to "India",
        "US" to "United States",
        "FR" to "France",
        "SL" to "Sri Lanka"
    )

    countries.forEach{
        (code,country) -> println("Code : $code, Name: $country")
    }

    val employeeDepartments = mapOf(
        101 to "Engineering",
        102 to "Sales",
        103 to "HR",
        104 to "Marketing",
        105 to "Finance"
    )

    for (empId in employeeDepartments.keys){
        println("Key is the employee ID : $empId")
    }


    val studentGrades = mapOf(
        "Anupam" to 85,
        "Kajal" to 92,
        "Champak" to 78,
        "Daniel" to 88,
        "Robin" to 95
    )

    for (grade in studentGrades.values){
        println("grade is the number $grade")
    }

    val isWeekend = mapOf(
        "Monday" to false,
        "Tuesday" to false,
        "Wednesday" to false,
        "Thursday" to false,
        "Friday" to false,
        "Saturday" to true,
        "Sunday" to true
    )

    for (entry in isWeekend.entries){
        println("Entry is ${entry.key} ${entry.value}")
    }

}