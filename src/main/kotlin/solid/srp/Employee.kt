package solid.srp

import kotlin.random.Random

class Employee(
    var firstName: String, var lastName: String,
    var salary: Double,
    var experience:Int
) {

    //employee details
    fun displayEmployee() {
        println("Employee Name $firstName $lastName")
        println("Employee salary $salary")
        println("Employee experience in years $experience")
    }

    //check senior or junior
    fun isSenior(experience:Int):String = if(experience > 5) "Senior" else "Junior"

    //generate employee ID
    fun generateEmployeeID(firstName: String): String {

        val random: Int = Random.nextInt(6000)
        return firstName.substring(0, 3) + random
    }

}

fun main(args: Array<String>) {

    val employee1 = Employee("goutam","mehra",53552.7,6)
    val employee2 = Employee("Kanan","Sundar",79012.89,3)

    employee1.displayEmployee()
    employee2.displayEmployee()

    println("Employee id is ${employee1.generateEmployeeID(employee1.firstName)}")
    println("Employee id is ${employee2.generateEmployeeID(employee2.lastName)}")

    println("Seniority of ${employee1.firstName} is ${employee1.isSenior(employee1.experience)}")
    println("Seniority of ${employee2.firstName} is ${employee2.isSenior(employee2.experience)}")
}

/*Now say that there are multiple stake holders ---- 1) Management executive decides to change the seniority criteria
 2) HR manager also decides to have a change in generating Employee ID logic. In this case two different stakeholders
 will force the employee class to be changed.
 The above class has two anomalies --- it generates seniority logic and also generates employee ID. These are two
 different responsibilities. It is a better option to follow Single Responsibility Principle (SRP) and write a
 better class.
Check out EmployeeSRP class for more clarity
*/
