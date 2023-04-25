package solid.ocp

class Student1(var name:String, var regNumber:String,
               var department:String,var score:Double) {

    val TOTAL_SCORE = 20
    val SCIENCE_DISTINCTION = 0.75 * TOTAL_SCORE //0.75 means 75% for science
    val ARTS_DISTINCTION = 0.7 * TOTAL_SCORE //0.7 means 70% for arts

    fun displayResult() {
        println("Student name $name and registration number $regNumber")
        println("$name scored $score in $department ")
    }

    fun evaluateDistinction(s1:Student1) {

        val science = listOf("Computers","Biology")
        val arts = listOf("History","English")

        if(science.contains(s1.department))
            if(s1.score >= SCIENCE_DISTINCTION)
                println("${s1.name} scored distinction in ${s1.department}")

        if(arts.contains(s1.department))
            if(s1.score >= ARTS_DISTINCTION)
                println("${s1.name} scored distinction in ${s1.department}")
    }
}



fun main(){

    //Assume there are four university students who take a semester examination.
    val karan = Student1("Karan","R1","Computers",18.9)
    val samita = Student1("Samita","R2","Biology",13.8)
    val bundi = Student1("Bundi","R3","History",13.6)
    val santosh = Student1("Santosh","R4","English",17.5)

    //karan and samita are Science students while bundi and santosh belong to the arts stream.

    //The scores are out of 20. To get distinction for a science student he/she must score at least 75%. For an arts student
    //the criterion for  securing distinction is 70%

    val sList = arrayListOf<Student1>()

    sList.add(karan)
    sList.add(samita)
    sList.add(bundi)
    sList.add(santosh)

    sList.forEach {
        it.evaluateDistinction(it)
        it.displayResult()
    }



}

/*
 First, the class violates SRP because both the displayResult() and the evaluateDistinction() methods are inside the Student class.
 These two methods are unrelated.

In the future, the exam authority can change the distinction criterion. In this case,
you’ll need to change the evaluateDistinction() method.
Does it solve the problem ? In the current situation, the answer is yes.
But the authority can change the distinction criterion again. This makes retesting the Student class due to the modification of the evaluateDistinction() method

Each time you modify the method, you change the container class as well which means that you need to modify the existing test cases too.

You can also see that every time the distinction criteria changes,
you need to modify the evaluateDistinction() method in the Student class.
So, this class does not follow SRP and it is also not closed for modification.

This problem is solved in the class BetterStudent1.kt

* */

