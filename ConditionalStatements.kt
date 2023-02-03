fun main() {
    var score: Int = 100

    if(score > 50) println("Great score!") else println("Better luck next time!")
    // Output >>> Great score!

    var name: String? = null

    if(name != null) {
        println(name)
    } else {
        name = "Santhos"
        println(name)
    }
    // Output >>> Santhos

    var amount: Int = 900

    var status: Int = if(amount > 500) amount-(amount*5/100) else amount
    println(status)  // Output >>> 855
 
    var food: String = "Apple"

    var action: String = if(food != "juice") {
        "Eat"
    } else {
        "Drink"
    }
    println(action)  // Output >>> Eat

    var animal: String = "Cat"

    when(animal) {
        "Dog" -> println("Woof")
        "Cat" -> println("Meow")
        "Cow" -> println("Moo")
        else -> println("There are no sounds")
    }
    // Output >>> Meow

    var number: Int = 20

    var sum: Int = when(number) {
        10 -> number + 10
        20 -> number + 20
        30 -> number + 30
        else -> number
    }
    println(sum)    // Output >>> 40

}