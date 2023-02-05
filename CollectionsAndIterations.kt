fun showBuyerInfo(item: String, customers: List<String>) {
    customers.forEach { customer -> println("$item is bought by $customer") }
}

fun main() {
    var fruits = arrayOf("Apple", "Banana", "Mango")

    println(fruits[0]) // Output >>> Apple
    println(fruits.get(2)) // Output >>> Mango
    println(fruits.size) // Output >>> 3

    for (fruit in fruits) {
        println(fruit)
    }
    /*
    <<< Output >>>
        Apple
        Banana
        Mango
    */

    fruits.forEach { println(it) }
    /*
    <<< Output >>>
        Apple
        Banana
        Mango
    */

    fruits.forEach { fruit -> println(fruit) }
    /*
    <<< Output >>>
        Apple
        Banana
        Mango
    */

    fruits.forEachIndexed { index, fruit -> println("$fruit is at index $index") }
    /*
    <<< Output >>>
        Apple is at index 0
        Banana is at index 1
        Mango is at index 2
    */

    var animals = listOf("Dog", "Cat", "Cow")

    println(animals[0]) // Output >>> Dog
    println(animals.get(1)) // Output >>> Cat
    println(animals.size) // Output >>> 3

    for (animal in animals) {
        println(animal)
    }
    /*
    <<< Output >>>
        Dog
        Cat
        Cow
    */

    animals.forEach { println(it) }
    /*
    <<< Output >>>
        Dog
        Cat
        Cow
    */

    animals.forEach { animal -> println(animal) }
    /*
    <<< Output >>>
        Dog
        Cat
        Cow
    */

    animals.forEachIndexed { index, animal -> println("$animal is at index $index") }
    /*
    <<< Output >>>
        Dog is at index 0
        Cat is at index 1
        Cow is at index 2
    */

    var asciiCharacters = mapOf(65 to "A", 66 to "B", 67 to "C")

    asciiCharacters.forEach { key, value -> println("$key is $value") }
    /*
    <<< Output >>>
        65 is A
        66 is B
        67 is C
    */

    var foods = mutableListOf("Bread", "Pizza", "Burger")
    foods.add("Rice")

    foods.forEach { food -> println(food) }
    /*
    <<< Output >>>
        Bread
        Pizza
        Burger
        Rice
    */

    var customers = mutableMapOf("cus01" to "Jhon Wick", "cus02" to "Jack Sparrow")
    customers.put("cus03", "Santhos Sundar")

    customers.forEach { key, value -> println("$key is $value") }
    /*
    <<< Output >>>
        cus01 is Jhon Wick
        cus02 is Jack Sparrow
        cus03 is Santhos Sundar
    */

    showBuyerInfo("Laptop", listOf("Johnny Depp", "Robert Downey Jr", "Chris Evans"))
    /*
    <<< Output >>>
        Laptop is bought by Johnny Depp
        Laptop is bought by Robert Downey Jr
        Laptop is bought by Chris Evans
    */
}
