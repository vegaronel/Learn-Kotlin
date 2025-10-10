fun main() {
    val animals = listOf("dog", "cat", "bird", "fish")

    var result = animals.map { animal ->
        animal[animal.length - 1].uppercase()
    }
    println(result)
}