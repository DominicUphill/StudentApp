import kotlin.system.exitProcess

fun main(){
    val university = University()
    var choice = ""

    while (choice != "4") {
        println()
        println("1. Add a student")
        println("2. Search for student by ID")
        println("3. Search for student by name")
        println("4. Quit")
        println("Please enter your choice:")
        choice = readln()

        when (choice) {
            "1" -> {
                println("Please enter a students name")
                val name = readln()

                println("Please enter the students ID")
                val id = readln()

                println("Please enter the students course")
                val course = readln()

                println("Please enter the students mark")
                val mark = readln().toDouble()

                val student = Student(id, name, course, mark, )

                university.enrolStudent(student)
                println("Student added successfully")
            }
            "2" -> {
                println("Please enter a student id to search")
                val id = readln()
                val student = university.findStudentByID(id)
                println(student)
            }
            "3" -> {
                println("Please enter a students name to search")
                val name = readln()
                val student = university.findStudentsByName(name)
                println(student)
            }
        }
    }
}
