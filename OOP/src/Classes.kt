
//  Class
class Users{
    var firstName : String = ""
    var lastName : String = ""
    var age : Int = 0

    fun getDetails() : String{
        return "Firstname $firstName\nLastname: $lastName\nAge: $age"
    }

}

// Constructors
class Cars(name: String, var brand : String, var color : String){
    var name : String = ""

    constructor(name : String, brand: String) : this(name, brand , "BLACK")

    init {
        if(name.lowercase().startsWith("r")){
            this.name = name.lowercase()
        }
        else{
            this.name = "No name"
        }
    }
}

// singleton
class Fare {
    companion object {
        fun fareCalculator(age: Int) : String {
            if(age in 18..30) {
                return "Your age is $age. Then you will pay 20 pesos."
            }else if(age in 1 .. 17) {
                return "Your age is $age. You'll only pay 15 pesos"
            }else {
                var message = "You will only pay 15 pesos."
                var convertToArray = message.split("").toMutableList()
                for (typeEffect in convertToArray) {
                    Thread.sleep(200)
                    print(typeEffect)
                }
                return "Success"
            }
        }

    }
}