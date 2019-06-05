import java.io.BufferedReader
import java.io.StringReader

fun percantageChech(percentage: Int) {
    if (percentage !in 0..100) {
        throw IllegalArgumentException("A percentage must be between 0 and 100: $percentage")
    }
}

fun readNumber(reader: BufferedReader):Int? {
    return try {
        val line = reader.readLine()
        Integer.parseInt(line)
    }
    catch (e: NumberFormatException) {
        null
    }
    finally {
        reader.close()
    }
}

fun readNumber1(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
    }
    println(number)
}

fun main() {
    percantageChech(10)

    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))
    println()

    val reader1 = BufferedReader(StringReader("not a number"))
    readNumber1(reader1)
    println()
}