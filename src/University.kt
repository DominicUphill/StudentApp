class University(val modules: MutableList<Module> = mutableListOf(), val students: MutableList<Student> = mutableListOf()) {

    fun findStudentByID(id: String): Student? {
        for (student in students) {
            if (student.id == id) {
                return student
            }
        }
        return null
    }
}