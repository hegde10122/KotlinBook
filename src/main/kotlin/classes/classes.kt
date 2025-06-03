package classes

class Z //valid class

class BankAccount(val accountHolder: String, var balance: Double) {


    //member function -- deposit
    fun deposit(amount: Double) {
        balance += amount
        println("₹$amount deposited. New balance: ₹$balance")
    }

    fun withdraw(amount:Double){

        if(amount < 0.0){
            println("Invalid")
            return
        }
        if(balance >= amount){
            balance -= amount
            println("₹$amount withdrawn. New balance: ₹$balance")
        }
        else {
            println("Insufficient balance. Withdrawal failed.")
        }
    }
}

fun main(){

    val account : BankAccount = BankAccount("Jivi",5000.0)
    account.deposit(5500.0)
    account.deposit(500.0)
    account.withdraw(1400.0)
    account.withdraw(300.50)
    account.withdraw(-12.35)
    val z = Z()
}