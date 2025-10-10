
class Task(var task : String)

fun main() {
    val task : MutableList<Task?>  = mutableListOf()
    var isDone = false
    while(!isDone) {

        try {
            println("What do you want to do? \n[1]Add Task \n[2]Show Task\n[3]Remove task \n[0]End")
            val answer = readln().toInt()
            when(answer) {
                0 -> isDone = true
                1 -> addTask(task)
                2 -> showTask(task)
                3 -> removeTask(task)
            }
        }catch(e : Exception){
            println("Please enter a valid input")
        }

    }


}

fun removeTask(tasks: MutableList<Task?>) {
    showTask(tasks)
    println("Please select a number to remove a task")

    tasks.removeAt(readln().toInt())
}


fun addTask(tasks : MutableList<Task?>) {
    println("Please add your new task.")
    val newTask = readln()

    tasks.add(Task(newTask))

    println("SUCCESS!!")

}

fun showTask(tasks: MutableList<Task?>) {
 if(tasks.size == 0) {
     println("You dont have any task")
 }else {
     println("Task List")
     tasks.forEachIndexed { index, task ->
         println("$index - ${task?.task}")
     }
 }
}