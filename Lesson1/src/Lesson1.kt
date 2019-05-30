import javax.swing.text.html.parser.Entity

data class Person (val name: String,
                   val age: Int? = null)

fun main(args: Array<String>){
    val persons= listOf(
        Person("Alice"),
        Person("Bob", 29))

    val oldest = persons.maxBy { it.age ?: 0 }
    println("The oldest is : ${oldest}") // мне больше нравится такой вариант ${oldest?.name}
}

/*
fun renderPersonList(persons: Collection<Person>) {
    createHTML().table {
        for (person in persons) {
            tr {
                td { +person.age }
                td { +person.name }
            }
        }
    }
}*/

/*
object CountryTable : IdTable() {
    val name = varchar("name", 250).uniqueIndex()
    val iso = varchar("iso", 2).uniqueIndex()
}

class Country(id: EntityId) : Entity(Id) {
    var name: String by CountryTable.name
    var iso: String by CountryTable.iso
}

val russia = Country.find {
    CountryTable.iso.eq("ru")
}.first()

println(russia.name)*/
