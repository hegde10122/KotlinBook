package solid.srp

import kotlin.random.Random

class EmployeeSRP(var firstName: String, var lastName: String,
                  var salary: Double,
                  var experience:Int) {

    //employee details
    fun displayEmployee() {
        println("Employee Name $firstName $lastName")
        println("Employee salary $salary")
        println("Employee experience in years $experience")
    }

}

fun main(){

    val employee1 = Employee("goutam","mehra",53552.7,6)
    val employee2 = Employee("Kannan","Sundar",79012.89,3)

    employee1.displayEmployee()
    employee2.displayEmployee()

    val idGenerator = EmployeeIdGenerator()
    println(idGenerator.generateEmployeeID(employee1.firstName))

    val seniorityChecker = SeniorityChecker()
    println(seniorityChecker.checkSeniority(employee1.experience))

}

class SeniorityChecker{

    fun checkSeniority(experienceInYears: Int): String {
        return if (experienceInYears >= 5) "senior" else "junior"
    }
}

class EmployeeIdGenerator {

    fun generateEmployeeID(firstName: String): String {

        val random: Int = Random.nextInt(6000)
        return firstName.substring(0, 3) + random
    }
}