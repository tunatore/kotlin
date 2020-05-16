fun whenCases(obj : Any) {
    when(obj) {
        1 -> println("one")
        2 -> println("two")
        3 -> println("three")
        is Long -> println("Long")
        is Number -> println("Number")
        is String -> println("String")
        !is String -> println("Not a String")
        else -> print("unknown")
    }
}

fun whenAssign(obj: Any): Any {
    val w = when(obj) {
        1 -> "one"
        2 -> "two"
        3 -> "three"
        6 -> "six"
        "test" -> "test"
        else -> "unknown"
    }
    return w
}

fun main(){
    whenCases(1)
    whenCases(2)
    whenCases(6L)
    whenCases("test")
    println(whenAssign(1))
    println(whenAssign(2))
}