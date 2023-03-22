package OOP

class House(owner:String,bedrooms:String,price:String) {

//initialize our class
    init {
        println("Owner is $owner")
        println("Number of bedrooms are $bedrooms")
        println("Asking price is $price")
    }

}

fun main(args: Array<String>) {
    var House_one = House("Marvel","3","6500000")
    var House_two = House("Sharon","7","68500000")
    var House_three = House("Marvel","3","6500000")
}