package hello

/**
 * Created by adiyatmubarak on 10/9/16.
 */
class Person(var name: String, var age: Int, var college: String?)

fun main(args: Array<String>) {
    val jake = Person("Jake Hill", 24, "Stanford")
    println(jake.name)
}