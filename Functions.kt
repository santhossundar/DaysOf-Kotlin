fun average(num1: Int, num2: Int): Int = (num1 + num2)/2

fun passwordQuery(): String = "Enter the password to continue ..."

fun sum(a: Int, b: Int): Int {
    var sum = a + b
    return sum
}

fun greeting(name: String): String {
    var greeting = "Hello $name!"
    return greeting
}

fun display() {
    println("Hello!")
}

fun main() {
    display()   // Output >>> Hello!

    println(greeting("Santhos"))    // Output >>> Hello Santhos!

    var sum: Int = sum(1, 8)
    println(sum)    // Output >>> 9

    println(passwordQuery()) // Output >>> Enter the password to continue ...

    println(average(6, 8))  // Output >>> 7
}
