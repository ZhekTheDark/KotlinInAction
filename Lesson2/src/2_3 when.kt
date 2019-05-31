package colors

enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

enum class Color1(
    val r: Int,
    val g: Int,
    val b: Int
) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75,0,130),
    VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b

}

fun getMnemonic(color: Color) =
        when(color) {
            Color.RED -> "Каждый"
            Color.ORANGE -> "Охотник"
            Color.YELLOW -> "Желает"
            Color.GREEN -> "Знать"
            Color.BLUE -> "Где"
            Color.INDIGO -> "Сидит"
            Color.VIOLET -> "Фазан"
        }

fun getWarm(color: Color) =
        when (color) {
            Color.RED, Color.ORANGE, Color.YELLOW -> "теплый"
            Color.GREEN -> "нейтральный"
            Color.BLUE, Color.INDIGO, Color.VIOLET -> "холодный"
        }

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

/*fun eval(e: Expr):Int {
    if (e is Num) {
        val n = e as Num //явное привидение к типу Num здесь излишне
        return n.value
    }
    if (e is Sum) {
        return eval(e.right) + eval(e.left) // переменная е уже привидена к нужному типу
    }
    throw IllegalArgumentException("Unknown Expression")
}*/

fun eval(e: Expr):Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval(e.right) + eval(e.left) // переменная е уже привидена к нужному типу
        else -> throw IllegalArgumentException("Unknown Expression")
    }

fun evalWithLogging(e: Expr): Int =
        when (e) {
            is Num -> {
                println("num: ${e.value}")
                e.value
            }
            is Sum -> {
                val left = evalWithLogging(e.left)
                val right = evalWithLogging(e.right)
                println("sum: $left + $right")
                left + right
            }
            else -> throw IllegalArgumentException("Unknown Expression")
        }

fun main() {
    println(Color1.BLUE.rgb())

    println(getMnemonic(Color.BLUE))

    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))

    println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))
}