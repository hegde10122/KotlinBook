fun main() {

    val salary = 1000
    var employee = "Sejal"
    println(salary) // 1000
    println(employee) // Sejal

    //salary = 1200 // is not possible because a is read-only!
    employee = "Manan"
    println(employee) // Manan

    val newline = "\nNewline"
    val doubleQ = "\"we are all inside double quotes\""
    val singleQ = "\'we are trapped inside single quotes but the future is promising\'"
    val tabbed = "\ttabbed values are disturbing\tAm i tabbed ?"

    val backslashes = "\\Do u want lashes on your back or are u interested in \\backslash"
    println(backslashes)
}

