package geometry.shape

import kotlin.random.Random

class Person(val name: String,
             var isMarried: Boolean)

class Rectangle(val height: Int,
                val weight: Int) {
    val isSquare : Boolean
            get() = height == weight
}

fun createRandomRectangle(): Rectangle {
    val random = Random
    return Rectangle(random.nextInt(), random.nextInt())
}

fun main(args: Array<String>) {
    println("Hello, world!")
    println(max(1, 2))

    val question = "Thr Ultimate Question of Life, the Universe, and Everything"
    val answer = 42

    val languages = arrayListOf("Java")
    languages.add("Kotlin")

    /*var answer1 = 42
    answer1 = "no answer"   //<- Ошибка: несовпадение типов*/

    val name = if (args.isNotEmpty()) args[0] else "Kotlin"
    println("Hello, $name!")

    if (args.isNotEmpty()) {
        println("Hello, ${args[0]}")
    }

    println("Hello, ${if (args.isNotEmpty()) args[0] else "someone"}!")

    val rectangle = Rectangle(41, 43)
    println(rectangle.isSquare)



    /*val mar = mutableMapOf<Int, Int>()
    mar[1] = 1
    println(mar)
    mar[1] = 3
    println(mar)*/
}

/*fun max(a: Int, b: Int): Int {
    return if (a > b) a
    else b
}*/

fun max(a: Int, b: Int): Int = if (a > b) a else b


