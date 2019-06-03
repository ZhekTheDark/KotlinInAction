import java.util.*

val oneToTen = 1..10

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) =
    when (c) {
        in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
        in '0'..'9' -> "It's a digit!"
        else -> "I don't know..."
    }

fun main() {
    for (i in 1.. 100) {
        print(fizzBuzz(i))
    }
    println()
    println()

    for (i in 100 downTo 1 step 2) {
        print(fizzBuzz(i))
    }
    println()
    println()

    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        /*val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary*/
        binaryReps[c] = Integer.toBinaryString(c.toInt())
    }
    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
    println()

    val list = arrayListOf("10", "11", "1001")
    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }
    println()

    println(isLetter('q'))
    println(isNotDigit('x'))
    println()

/*    val start = System.currentTimeMillis()
    val finish = System.currentTimeMillis()
    println("start = $start, finish = $finish, diff = ${finish-start}")*/

    println(recognize('8'))
    println()

    println("Kotlin" in "Java".."Scala")
    println("Kotlin" in setOf("Java", "Scala"))
    println()


}