class University(val modules: MutableList<Module> = mutableListOf(), val students: MutableList<Student> = mutableListOf()) {

    fun findStudentByID(id: String): Student? {
        for (student in students) {
            if (student.id == id) {
                return student
            }
        }
        return null
    }

    fun enrolStudent(student: Student) {
        students.add(student)
    }

    fun findStudentsByName(name: String): MutableList<Student> {
        val matchingStudents: MutableList<Student> = mutableListOf()

        for (student in students) {
            if (student.name == name) {
                matchingStudents.add(student)
            }
        }
        return matchingStudents
    }

}