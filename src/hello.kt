//fun main(args: Array<String>) { println("Hello Kotlin... ")}



val person = Person("Nikhil", true)

fun main() {

    println("\t\t\t Person Name is -> ${person.name} AND his Marital Status is -> ${person.isMarried} ! \n\n")

    println(person.isMarried)


}


class Person (

    val name: String,
    var isMarried: Boolean

)