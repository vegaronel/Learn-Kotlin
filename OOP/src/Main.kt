
fun main(){


  var instance = Database.getInstance()
  var instance2 = Database.getInstance()
  println(instance)
  println(instance2)

}

object Database {
    init {
        println("OK")
    }
  private var instance : Database? = null
  fun getInstance() : Database? {
    if(instance == null) {
      instance = Database
    }
    return instance
  }
}


/*
  we have learn creating class, constructors, getter and setter and companion objects or singleton

  1,2 use companion object // this means if something is already called it wont get what already have
 */

