class GenericClass<E>(vararg items: E) {

    private val set = items.toMutableSet()

    fun add(element: E) = set.add(element)
    fun getFirst(): E = set.first()
    fun getLast(): E = set.last()
    fun isEmpty() = set.isEmpty()
    fun size() = set.size
    override fun toString() = "GenericClass(${set.joinToString()})"
}

fun <E> mutableGenericClassOf(vararg elements: E) = GenericClass(*elements)

fun main() {
    val genericClass = GenericClass("test1", "test2", "test3")
    genericClass.add("test4")
    genericClass.add("test5")
    println("genericClass isEmpty: " + genericClass.isEmpty())
    println("genericClass getFirst: " + genericClass.getFirst())
    println("genericClass getLast: " + genericClass.getLast())
    println("genericClass size: " + genericClass.size())
    println(genericClass.toString())

    val genericClassOf = mutableGenericClassOf("test1", "test2", "test3")
    println("genericClassOf getFirst: " + genericClassOf.getFirst())
    println("genericClassOf getLast: " + genericClassOf.getLast())
    println("genericClassOf size: " + genericClassOf.size())
    println(genericClassOf.toString())
}