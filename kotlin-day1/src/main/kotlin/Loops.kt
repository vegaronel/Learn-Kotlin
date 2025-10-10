import java.util.logging.Handler
import java.time.LocalTime
fun main() {
val persons : Array<String> = arrayOf("ROnel", "Law", "Saturo", "Nagumo")

//    this is range in loop
    for(x in 20 downTo 1) {
        println(x)
    }

//    for loop
    for(person : String in persons) {
        println("this is $person")
    }

//    foreach
    var lastPerson = ""
    persons.forEach {
        if(lastPerson.length != 0){
            println("$lastPerson VS $it")
        }
        it.also { lastPerson = it }
    }

    for(i in 0 until 10 step 2){
        println(i)
    }

    for (i in 1 until 10) {
        println("------------------------")
        println(i)
    }




    var number : Int = 0
    var skip : Int = 6


    var totalEven = 0;
    for(i in 0 until 20){

        if(i % 2 == 1) {
            continue
        }

        Thread.sleep(1000) // 1 second for testing
        println("$i is Even")
        totalEven++

    }
    println("Total even numbers $totalEven")
//
//    do{
//        number++
//        if (number == 23) {
//            println("heyy you just you found me at index $number")
//            break
//        }
//        if(number == skip) {
//            println("AHAA YOU ARE IMPOSTOR, GET OUT OF THE WAY");
//        }
//        println("Still finding you... $number")
//
//    }while(number <= 100)



}
