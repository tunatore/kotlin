class Object {
    companion object Test {
        fun printN(i: Int) {
            for (i in 1 .. i) {
                print(i)
            }
            println()
        }
    }
}

fun function(x: String, y: String){
    val newObject = object {
        var x: String = x
        var y: String = y
    }
    val values = newObject.x + "-" + newObject.y
    print("$values")
}

object SingletonClass {
    fun method(str1: String, str2: String){
        println("$str1:$str2")
    }
}

fun main() {
    SingletonClass.method("test1", "test2")
    Object.printN(10)
    function("x", y = "y")
}