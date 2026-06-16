fun main() {
    println("Welcome to Student Grade Calculator")
    print("Enter Your Name :")
    val name = readln()
    println("Hello $name! Enter your Marks")

    print("Enter English marks: ")
    val english = readln().toInt()

    print("Enter Hindi marks: ")
    val hindi = readln().toInt()

    print("Enter Marathi marks: ")
    val marathi = readln().toInt()

    print("Enter Science marks: ")
    val science = readln().toInt()

    print("Enter Maths marks: ")
    val maths = readln().toInt()

    val total = english + hindi + marathi + science + maths

    val average = total / 5.0

    val grade = if(average >= 90){
        "A+"
    }else if(average >= 80){
        "A"
    }else if(average >= 70){
        "B+"
    }else if(average >= 60){
        "B"
    }else if(average >= 50){
        "C+"
    }else if(average >= 40){
        "C"
    }else{
        "D"
    }

    println("#Result are disclosed")
    println("Student name is : $name")
    println("Total Marks : $total")
    println("Average Marks : $average")
    println("Grade Marks : $grade")
}


