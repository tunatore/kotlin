//void
fun voidMethod(message: String): Unit {
    println(message)
}

fun printMessage(message1: String, message2: String = "defaultMessage") {
    println("$message1 $message2")
}

fun methodWithReturn(message1: String, message2: String): String = "$message1 $message2"

fun main() {
    voidMethod("test")
    printMessage("test1", "test2")
    printMessage("test1")
    println(methodWithReturn("test1", "test2"))
}
