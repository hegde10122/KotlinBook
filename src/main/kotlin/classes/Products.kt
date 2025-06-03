package classes

// Write your code here

class Product(name:String, price:Double, quantity:Int){

     var quantity = quantity
         set(value){

             if(value < 0){
                 field = 0
             }
             else{
                 field = value
             }
         }
     var name = name
     var price = price

    fun calculateTotalValue() : Double {
        return quantity * price
    }

    fun restock(value:Int){

        if(value <=0){
            return
        }

        quantity += value
    }

    override fun toString(): String {
         return "Product(name=$name,price=$price,quantity=$quantity)"
    }
//Product Information: Product(name=Laptop, price=999.99, quantity=5)
}

fun main() {
    val laptop = Product("Laptop", 999.99, 5)

    // Print complete information of the Product object
    println("Product Information: $laptop")

    // Print specific details
    println("Product Name: ${laptop.name}")
    println("Initial Quantity: ${laptop.quantity}")
    println("Total Value: ${laptop.calculateTotalValue()}")

    laptop.restock(3)

    // Print complete information after restocking
    println("\nProduct Information after Restocking: $laptop")

    // Print specific details
    println("Updated Quantity: ${laptop.quantity}")
    println("Updated Total Value: ${laptop.calculateTotalValue()}")

    laptop.quantity = -2

    // Print complete information after clamping quantity
    println("\nProduct Information after Clamping Quantity: $laptop")

    // Print specific details
    println("Clamped Quantity: ${laptop.quantity}")
    println("Total Value after Clamping: ${laptop.calculateTotalValue()}")

    laptop.quantity = 10

    // Print complete information after updating quantity
    println("\nProduct Information after Updating Quantity: $laptop")

    // Print specific details
    println("Updated Quantity: ${laptop.quantity}")
    println("Updated Total Value: ${laptop.calculateTotalValue()}")
}