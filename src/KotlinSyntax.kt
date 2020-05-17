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

enum class Test {
    TEST1,
    TEST2,
    TEST3
}

//object declaration -> cannot assign as expression ->lazy initialization
object ObjectDeclaration {
    fun objectMethod(test1: String, test2: String){
        println("parameters = $test1:$test2")
    }
}

fun main(){
    whenCases(1)
    whenCases(2)
    whenCases(6L)
    whenCases("test")
    println(whenAssign(1))
    println(whenAssign(2))

    //enum
    val testEnum = Test.TEST1
    val testEnumWhen = when(testEnum) {
        Test.TEST1 -> "TEST1"
        Test.TEST2 -> "TEST2"
        else -> "Unknown"
    }
    print(testEnumWhen)

    // object expression -> created as anonymous class - lazy initialization
    val objectExpression = object {                                                     //2
        var value1: Int = 1
        var value2: Int = 2
    }

    println(objectExpression.value1)
    println(objectExpression.value2)

    ObjectDeclaration.objectMethod("test1-value", "test2-value")

    // if control flow
    val x = 0
    val y = 0
    val ifControlFlow = if (x > y) {
        print("x > y")
        x
    }else {
        print("else")
        y
    }

}