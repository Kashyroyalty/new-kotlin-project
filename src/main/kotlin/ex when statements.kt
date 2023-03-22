fun main(args: Array<String>) {

    print("Enter option")
    var number:Int = readLine()!!.toInt()

    when(number){
        0->  println("sh20 1GB for 1hr")
        1->  println("Data deals")
        2->  println("Daily bundles")
        3->  println("Weekly bundles")
        4->  println("Go Monthly")
        5->  println("No expiry")
        6->  println("Video bundles")
        7->  println("Okoa data")

        else->  println("Invalid option")

    }











}