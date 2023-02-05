fun showGreeting5(greet: String = "Hello", vararg namesToBeGreeted: String) {
    namesToBeGreeted.forEach { nameToBeGreeted -> println("$greet $nameToBeGreeted") }
}

fun showGreeting4(greet: String, nameToBeGreeted: String = "World") =
        println("$greet $nameToBeGreeted")

fun showGreeting3(greet: String, nameToBeGreeted: String) = println("$greet $nameToBeGreeted")

fun showGreeting2(greet: String, vararg namesToBeGreeted: String) {
    namesToBeGreeted.forEach { nameToBeGreeted -> println("$greet $nameToBeGreeted") }
}

fun showGreeting(namesToBeGreeted: List<String>, greet: String) {
    namesToBeGreeted.forEach { nameToBeGreeted -> println("$greet $nameToBeGreeted") }
}

fun main() {
    showGreeting(listOf("World", "Kotlin", "Dev"), "Hello")
    /*
    <<< Output >>>
        Hello World
        Hello Kotlin
        Hello Dev
    */

    showGreeting2("Hello", "World", "Kotlin", "Dev")
    /*
    <<< Output >>>
        Hello World
        Hello Kotlin
        Hello Dev
    */

    val firstNames = arrayOf("World", "Kotlin", "Dev")
    showGreeting2("Hello", *firstNames)
    /*
    <<< Output >>>
        Hello World
        Hello Kotlin
        Hello Dev
    */

    showGreeting3(greet = "Hello", nameToBeGreeted = "world") // Output >>> Hello World
    showGreeting3(nameToBeGreeted = "world", greet = "Hello") // Output >>> Hello World
    showGreeting4(greet = "Hello") // Output >>>

    val secondNames = arrayOf("Programming", "VSCode", "GitHub")
    showGreeting5(greet = "Hi", namesToBeGreeted = *secondNames)
    /*
    <<< Output >>>
        Hi Programming
        Hi VSCode
        Hi GitHub
    */
}
