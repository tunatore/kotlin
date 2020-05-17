import java.math.BigInteger

val list1: MutableList<Number> = mutableListOf(1,2,3,4,5,6) // mutable list
val list2 = listOf(1,2,3,4,5,6) // read only list

fun main() {
    list1.forEach { i -> println("list value: $i") }
    println(list1[0])
    println(list1.get(0))
    println("list count:" + list1.count())
    println("list size:" + list1.size)
    val countEvenNumbers =  list2.count { i -> i % 2 == 0 }
    println("count even elements:$countEvenNumbers")
}