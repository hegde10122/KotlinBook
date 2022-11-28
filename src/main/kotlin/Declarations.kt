
fun main(){
      val number = 22

      var z = "Boy"

      var x : String = "kotlin"

      var q : Double = 1.34

      val n : Int = 44
      val k : String = "I am rich"
      var a  = 44.55

      val stud1 = Student("Bharati Ganatra",32,5245)
      stud1.age = 45

      //The below assignment will return an error because collegeId is defined as val
     // stud1.collegeId = 5553

      //The below assignment will return an error because stud1 object is defined as val
     // stud1 = Student("Danish Kumar",23,5612)

      println(stud1.age)
      println(stud1.name)

      //The instance

     var stud2 = Student("Danish Kumar",23,5612)

}

//In the Intellij IDE, the variables z,q and a will be underlined to denote the fact that they are variables of type "var". The "val" variables
//are not underlined. You can see number,n and k without underlines. This distinction is available in IDEs like IntelliJ only. Kotlin
//explicitly does not underline them. Hope you get this important point.

//val keyword is used to declare a constant called q (line 9) which is of type Double.
//Then it sets the value of the constant to the decimal number 1.34

//val keyword is used to declare a constant called x which is of type String (line 7).
//Then it sets the value of the constant to the data string "kotlin"
// = is the assignment operator

//val variables are immutable - it means once assigned, cannot change again
//var variables are mutable -- assignment and reassignment is possible


class Student(var name:String,var age: Int,val collegeId:Int){

}