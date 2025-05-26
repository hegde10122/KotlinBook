package functions

class Employee(val name: String) {
    fun greet() {
        println("Hello $name, welcome back to the office. Have a fruitful day")
    }
}

fun main() {
    val emp1 = Employee("Abhilasha")
    emp1.greet()
    // Output: Hello Abhilasha, welcome back to the office. Have a fruitful day

}