fun main(args: Array<String>) {
    for (i in 1..100){
        if (i % 3 ==0){
            println(" $i Fizzuzz")
        }
        else if(i % 5 == 0){
            println("$i Buzz")
        }
        else if (i % 15 == 0){
            println("$i Fizz")
        }
        else {
            println("$i not divisible")
        }

    }
}