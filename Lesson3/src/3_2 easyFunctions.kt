fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

var opCount = 0

fun performOperation() {
    opCount ++
}

fun reportOperationCount() {
    println("Operation performed $opCount times")
}

fun main() {
    val list = listOf(1, 2, 3)
    println(list)
    println(joinToString(list,"; ", "(", ")"))
    println(joinToString(collection = list, separator = " ", prefix = " ", postfix = "."))
    println(joinToString(list,"| "))
    println()

    for (i in 1..5) performOperation()
    reportOperationCount()
    println()
}