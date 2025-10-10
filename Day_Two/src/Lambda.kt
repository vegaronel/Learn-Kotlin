fun main() {

    var dirtyLevel: (Int)-> Int = {x -> x / 2}


    updateDirty(30, dirtyLevel)

}

fun updateDirty(dirty: Int, operation: (Int) -> Int) : Int {
    return operation(dirty)
}






