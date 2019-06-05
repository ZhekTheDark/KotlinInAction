//import strings.lastChar
import join.join
import join.joinToStringMy
import strings.lastChar as last

open class View{
    open fun click() = println("View clicked")
}

class Button: View() {
    override fun click() = println("Button clicked")
}

fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button!")

val String.lastChar: Char
    get() = get(length - 1)

var StringBuilder.lastchar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

fun main() {
    //println("Kotlin".lastChar())
    println("Java".last())
    println()

    val list = listOf(1, 2, 3)
    println(list.joinToStringMy(separator = "; ", prefix = "(", postfix = ")"))
    println()

    val list1 = arrayListOf(1, 2, 3)
    println(list1.joinToStringMy(" "))
    println()

    val list2 = listOf("one", "two", "eight")
    println(list2.join(" "))
    println()

    /*val list3 = listOf(1, 2, 8)
    println(list3.join(" "))
    println() <--- Type mismatch*/

    val view: View = Button()
    view.click()
    println()

    val view1:View = Button()
    view1.showOff() //          <---don't inheritance
    println()

    println("Kotlin".lastChar)
    val sb = StringBuilder("Kotlin?")
    println(sb)
    sb.lastchar = '!'
    println(sb)
    println()
}