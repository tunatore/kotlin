val list1: MutableList<Number> = mutableListOf(1,2,3,4,5,6) // mutable list
val list2 = listOf(1,2,3,4,5,6) // read only list
val mutableSet: MutableSet<Number> = mutableSetOf(1,2,3,4,5,6) //mutable set
val mutableMap: MutableMap<Int,Int> = mutableMapOf(1 to 1, 2 to 2, 3 to 3)

data class Person(var name: String, var surname: String, var deptId: Int) {
    constructor() : this("", "", 0)
}

fun main() {

    list1.forEach { i -> println("list value: $i") }
    println(list1[0])
    println(list1.get(0))
    println("list count:" + list1.count())
    println("list size:" + list1.size)

    val countEvenNumbers =  list2.count { i -> i % 2 == 0 }
    println("count even elements:$countEvenNumbers")

    println("mutableSet add:" + mutableSet.add(1))
    println("mutableMap get:" + mutableMap.get(1))

    println("mutableMap contains key:" + mutableMap.containsKey(1))
    println("mutableMap contains value:" + mutableMap.containsValue(1))

    println("mutableMap[1]: " + mutableMap[1])
    println("mutableMap[2]: " + mutableMap[2])
    println("mutableMap[100]: " + mutableMap[100])

    mutableMap.forEach { (k, v) -> println("key:$k value: $v") }

    val divideBy2 = list2.filter { x -> x % 2 == 0 }
    println(divideBy2)

    val greaterThan1 = list2.filter { x -> x > 1 }
    println(greaterThan1)

    val list = listOf(1,2,3,4,5,6)
    val multipleBy2 = list.map { x -> x * 2 }
    val multipleBy3 = list.map { it * 3}
    println(multipleBy2)
    println(multipleBy3)

    val listOfNumbers = listOf(1, 2, 3, 4, 5, 6, -1, -2, -3)
    val evenOddPartitions = listOfNumbers.partition { it % 2 == 0 }
    val (negatives, positives) = listOfNumbers.partition { it < 0 }
    println("evenOddPartitions: $evenOddPartitions")
    println("negatives: $negatives")
    println("positives: $positives")

    val people = listOf(
            Person("name-test1","surname-test1", 101),
            Person("name-test2","surname-test2", 102),
            Person("name-test3","surname-test3", 101),
            Person("name-test4","surname-test4", 102),
            Person("name-test5","surname-test5", 101))

    val departmentLastPeopleById = people.associateBy { it.deptId } // last suitable element
    println(departmentLastPeopleById)

    val departmentPeople = people.groupBy { it.deptId }
    println(departmentPeople)

    val departmentPeopleBySurname = people.groupBy(Person::deptId, Person::surname)
    println(departmentPeopleBySurname)
}