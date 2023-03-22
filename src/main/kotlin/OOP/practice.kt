package OOP

class Vehichle(owner:String, make:String, colour:String){
    init {
        println("Owner of the car is $owner")
        println("Type of the car is $make")
        println("Colour of the car is $colour")
    }

}

fun main(args: Array<String>) {
    var Vehichle_one= Vehichle("Mikail", "G-wargon", "black")
    var Vehichle_two= Vehichle("Maseek", "Mark-x", "grey")
    var Vehichle_three= Vehichle("Tracy", "Discovery", "white")
}