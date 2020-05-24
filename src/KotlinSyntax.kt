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

enum class TestEnum (valueString: String) {
    TEST1 ("TEST1VALUE"),
    TEST2 ("TEST2VALUE")
}

class Test2 (var str1:String, var str2:String)

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
        TestEnum.TEST1 -> "TestEnum.TEST1"
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

    var listNumbers = listOf(1,2,3,4,5,6)
    val firstOrNull = listNumbers.firstOrNull { it > 0}
    val lastOrNull = listNumbers.lastOrNull() { it > 0}
    println(firstOrNull)
    println(lastOrNull)

    //flatMap
    val flatMapList = listNumbers.flatMap { listOf(it, it) }
    println(flatMapList)

    //min max
    val min = listNumbers.min()
    println(min)
    println("${listNumbers.min()}")

    val max = listNumbers.max()
    println(max)
    println("${listNumbers.max()}")

    var emptyList = emptyList<Int>()
    println("min: ${emptyList.min()} max:${emptyList.max()}")

    var numbers = listOf(2,3,5,6,4,1)
    var sorted = numbers.sorted()
    var inverted = numbers.sortedBy { -it }
    println("sorted: $sorted")
    println("inverted $inverted")

    //loop break
    loop1@ for (i in 1..100) {
        println("i:$i")
        if (i == 10) {
            break@loop1
        }
    }

    loop2@ for (i in 1..100) {
        println("i:$i")
        for (j in 1..100) {
            print("j:$j")
            if (j == 10) break@loop2
        }
    }

    println()

    //with
    val test = Test2(str1="test variable1", str2="test variable2")
    with(test) {
        println("$str1 $str2")
    }

    //for
    val list1 = listOf("test1", "test2", "test3")
    for (element in list1) {
        println("$element")
    }

    for(i in 1..10) {
        print(i)
    }
    println()

    for(i in 1..10 step 2) {
        print(i)
    }
    println()

    for (i in 10 downTo 1) {
        print(i)
    }
    println()

    for (c in 'a'..'e') {
        print(c)
    }
    println()

    for (c in 'e' downTo 'a' step 2) {
        print(c)
    }
    println()

    val i = 2
    if (i in 1..10) {
        print("i is in range from 1 to 10")
    }
    println()
    if (i !in 6..10) {
        print("i is not in range from 6 to 10")
    }
    println()

    val (a, b, c) = arrayOf(2, 5, 10)                              // 1
    println("$a-$b-$c")

    val map = mapOf("a" to 1, "b" to 2)
    for ((key, value) in map) {                                      // 2
        println("$key$value")
    }

    fun test(a:Int) = if (a > 2) true else false
    println(test(6))

    data class Test(val str1: String, val str2: String)
    val testObject = Test("a", "b")
    val testObject2 = Test("a", "b")
    println(testObject)
    println(testObject.str1)
    println(testObject.str2)
    println(testObject.hashCode())
    println("testObject.equals(testObject2):" + testObject.equals(testObject2))
    println("(testObject == testObject2):" + (testObject == testObject2))
    println("${testObject.str1}${testObject.str2}")

}