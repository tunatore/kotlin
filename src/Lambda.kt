val lowerCase1: (String) -> String = { str: String -> str.toLowerCase() }
val lowerCase2: (String) -> String = { str -> str.toLowerCase() }
val lowerCase3 = { str: String -> str.toLowerCase() }
val lowerCase4: (String) -> String = { it.toLowerCase() }
val lowerCase5: (String) -> String = String::toLowerCase

fun main() {
    println(lowerCase1("TEST"))
    println(lowerCase2("TEST"))
    println(lowerCase3("TEST"))
    println(lowerCase4("TEST"))
    println(lowerCase5("TEST"))
}