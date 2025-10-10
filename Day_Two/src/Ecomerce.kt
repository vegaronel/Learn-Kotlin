fun main() {
    val clothes : MutableList<Item?> = mutableListOf(
        Item("Gucci Shirt", 300),
        Item("Puma Shirt", 300),
        Item("Tuxedo", 300),
        Item("Dress", 300),
        Item("Polo Shirt", 300)
    )
    var isDone = false
    var money = 1000

    while (!isDone) {

        println("Press 1 to see the list of Clothes.\nPress 2 to Buy.\nPress 0 to leave")
        val userInput = readln().toInt()
        when(userInput) {
            0 -> isDone = true
            1 -> showClothes(clothes)
            2 -> {
                val change : Int? = buyClothes(clothes, money)
                if (change != null) {
                    money -= change
                    println("------------Your new balance is $change----------")
                }
            }
        }

    }

}
fun buyClothes(clothes: MutableList<Item?>, money: Int): Int {
    try {
        showClothes(clothes)
        println("Please select a clothes to buy.")
        val selectedItem: Int = readln().toInt()

        val price = clothes[selectedItem]?.price ?: 0
        if (money < price) {
            println("Not enough money!")
            return money
        }

        val newBalance = money - price
        clothes.removeAt(selectedItem)

        println("You bought ${clothes.getOrNull(selectedItem)?.name ?: "an item"} for $price")
        return newBalance
    } catch (e: Exception) {
        println("Invalid input")
        return money
    }
}


fun showClothes(clothes : MutableList<Item?>) {
    clothes.forEachIndexed { index, item ->
        println("$index Name:${item?.name} Price:${item?.price}\n")
    }

}

class Item(var name: String, var price : Int)
