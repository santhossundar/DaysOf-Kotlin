val number: Int = 1
var text: String = "Sample text"

var nullVariableInitAsTopLevel: String? = null

fun main() {
    val firstName = "Santhos"
    var lastName = "Sundar"
    println(firstName) // Output >>> Santhos
    println(lastName) // Output >>> Sundar

    val age: Int = 23
    println(age) // Output >>> 23

    val userName: String
    userName = "santhossundar"
    println(userName)   // Output >>> santhossundar

    var nullVariableInitAsLocal: String? = null
    nullVariableInitAsLocal = "Value is assigned"
    println(nullVariableInitAsLocal)    // Output >>> Value is assigned

    println(number) // Output >>> 1
    println(text)   // Output >>> Sample text

    nullVariableInitAsTopLevel = "Value is assigned"
    println(nullVariableInitAsTopLevel)  // Output >>> Value is assigned
}
