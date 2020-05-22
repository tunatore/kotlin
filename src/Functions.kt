//void
fun voidMethod(message: String): Unit {
    println(message)
}

fun printMessage(message1: String, message2: String = "defaultMessage") {
    println("$message1 $message2")
}

fun methodWithReturn(message1: String, message2: String): String = "$message1 $message2"

fun higherOrderFunction(x: Int, y: Int, functionArgument: (Int, Int) -> Int): Int {
    return functionArgument(x, y)
}

fun sum(x:Int, y:Int) =  x + y

fun returningFunction(): (Int, Int) -> Int {
    return ::sum
}

fun main() {
    voidMethod("test")
    printMessage("test1", "test2")
    printMessage("test1")
    println(methodWithReturn("test1", "test2"))

    //higher-order function
    //A higher-order function is a function that takes another function as parameter and/or returns a function.
    println(higherOrderFunction(2, 100, ::sum))
    println(higherOrderFunction(2,100) { x, y -> x + y })

    //returning function
    val func = returningFunction()
    println(func(2, 100))
}
