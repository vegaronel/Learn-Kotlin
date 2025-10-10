fun main() {
    var cars = mutableListOf(
        Car("Honda", 2010),
        Car("Mazda", 2001),
        Car("Mercedes", 2002),
        Car("Ferrari", 2005),
        Car("Tesla", 2008),
        Car("BMW", 2013),
    )



    var isDone = false

    while (!isDone) {
        try {
            println("Press enter [1] to show car list.\nPress enter [2] for adding a new car.\n[3] to remove a car")
            var userInput = readln().toInt()
            when(userInput) {
                1 -> getCars(cars)
                2 -> addCar(cars)
                3 -> removeCar(cars)
                4 -> searchCar(cars)
                0 -> isDone = true
            }
        }catch(e : Exception) {
            println("Please enter a valid number")
        }

    }


}

fun getCars(cars : MutableList<Car>) {
    cars.forEachIndexed{ index, car ->
        println("Index [$index] - Brand : ${car.brand} - Date Manufactured : ${car.year}")
    }
    println("\n-----------------------\n")
}

fun addCar(cars : MutableList<Car>) {
    try {
        println("Type in your new car")
        val newCar = readln()

        if(newCar.isEmpty()) {
            println("Invalid car name")
            return
        }

        println("Enter the date manufacture.")
        val dateManufactured = readln().toInt()



        cars.add(Car(newCar, dateManufactured))
        println("$newCar successfully added")

    }catch (e : Exception) {
        println("-------------------\nError inputs, please try again.\n-------------------")
    }
}


fun removeCar(cars : MutableList<Car>) {
    getCars(cars)
      try {
          println("Please enter their index number to remove")
          val indexNum = readln().toInt()

          cars.removeAt(indexNum)

      } catch(e : Exception) {
          println("Enter valid number")
      }

}

fun searchCar(cars : MutableList<Car>) {
    println("Enter the car name to search.")
    var userInput = readln()

    var result = cars.filter {
        it.brand.lowercase().contains(userInput.lowercase())
    }

    if(result.size > 0) {
        result.forEach {
            println(it.brand)
        }
    }else {
        println("There is no such $userInput")
    }

}

class Car(var brand : String , var year : Number)
