fun main(){
    while(true) {
        println("Please enter a students name (or type quit to exit the program)")
        val name = readln()
        if (name == "quit")
            break

        println("Please enter the students ID")
        val id = readln()

        println("Please enter the students course")
        val course = readln()

        println("Please enter the students mark")
        val mark = readln().toDouble()

        val student = Student(id, name, course, mark)
        println(student)
    }
}