import java.util.UUID

fun main() {
    var students = mutableMapOf<UUID, Student>()
    var isDone = false
    while (!isDone) {
        println("[1] to add create a new student\n[2] to show all students")
        when(readln().toInt()) {
            1 -> addNewStudent(students)
            2 -> showStudents(students)
            3 -> searchStudent(students)
            0 -> isDone = true
        }
    }

}

fun searchStudent(students: MutableMap<UUID, Student>) {
    println("Enter student ID")
    val id = readln()
}


fun addNewStudent(students: MutableMap<UUID, Student>) {
    println("Type name")
    val name = readln();
    println("Type age")
    val age = readln().toInt()
    val id = UUID.randomUUID()
    students[id] = Student(name,age, id)
    println("Success adding $name\n")
}

fun showStudents(students: MutableMap<UUID, Student>) {

    if(students.isEmpty()) {
        println("Record is empty")
    }

    for((id, value) in students) {
        println("ID: $id - Name: ${value.name}")
    }
}

abstract class Person(val name : String, val age : Int) {
     fun greet() {
         println("Hello $name")
     }
    abstract fun getDetails()
}

class Student(name: String, age: Int, private val studentId: UUID) : Person(name, age) {
    override fun getDetails() {
        println("\nID: $studentId\nName: $name\nage : $age ")
    }

}



class Questions(val question : String, val answer : String)