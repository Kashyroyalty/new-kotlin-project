fun main(args: Array<String>) {
    print ("Enter marks scored")

    var marks:Int = readLine()!!.toInt()


    if (marks >= 80){
        print("A Congratulations")
    }
    else if (marks >= 70){
        print("A- Good job")
    }
    else if (marks >= 60){
        print("B Average")
    }
    else if (marks >= 50){
        print("C Good trial can do better")
    }
    else if (marks <=49){
        print(" E Below average retake the exam")
    }
}