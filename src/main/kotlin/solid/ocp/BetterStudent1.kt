package solid.ocp

class BetterStudent1(var name:String, var regNumber:String,
                     var department:String,var score:Double)  {

    fun displayResult() {
        println("Student name $name and registration number $regNumber")
        println("$name scored $score in $department ")
    }

}

class DistinctionCalculator{

    val TOTAL_SCORE = 20
    val SCIENCE_DISTINCTION = 0.75 * TOTAL_SCORE //0.75 means 75% for science
    val ARTS_DISTINCTION = 0.7 * TOTAL_SCORE //0.7 means 70% for arts

    val science = listOf("Computers","Biology")
    val arts = listOf("History","English")

    fun evaluateDistinction(s1:Student1) {

        if(science.contains(s1.department))
            if(s1.score >= SCIENCE_DISTINCTION)
                println("${s1.name} scored distinction in ${s1.department}")

        if(arts.contains(s1.department))
            if(s1.score >= ARTS_DISTINCTION)
                println("${s1.name} scored distinction in ${s1.department}")

        println("\n")
    }

}

fun main(){

    //get the list  of students
    val studentList = students()

    val distinctionCalculator = DistinctionCalculator()

    studentList.forEach{
        it.displayResult() //display the student details
        distinctionCalculator.evaluateDistinction(it)
    }



}

fun students(): List<Student1> {

    //Assume there are four university students who take a semester examination.
    val karan = Student1("Karan","R1","Computers",18.9)
    val samita = Student1("Samita","R2","Biology",13.8)
    val bundi = Student1("Bundi","R3","History",13.6)
    val santosh = Student1("Santosh","R4","English",17.5)

    val sList = arrayListOf<Student1>()

    sList.add(karan)
    sList.add(samita)
    sList.add(bundi)
    sList.add(santosh)

    return sList
}

/*

 In this class we are following the SRP. If in the future the exam authority changes the distinction criterion,
 we do not touch the BetterStudent1 class. So, this part is closed for modification.

 This solves one part of the problem. Now think about another future possibility:
The college authority can introduce a new stream such as commerce and set a new distinction criterion for this stream.
We need to make some obvious changes again.
For example, you need to modify the evaluateDistinction() method and add another if statement to consider commerce students.

Now the question is, is it ok to modify the evaluateDistinction() method in this manner?
Remember that each time you modify the method, you need to test the entire code workflow again.
You understand the problem now. In this code example,
every time the distinction criteria changes, we need to modify the evaluateDistinction() method in the DistinctionCalculator class.
So, this class is not closed for modification.
* */