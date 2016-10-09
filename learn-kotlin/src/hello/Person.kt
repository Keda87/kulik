package hello

/**
 * Created by adiyatmubarak on 10/9/16.
 */
class Person {
    var name: String = ""
    var age: Int = 0
    var college: String? = null
}

fun main(args: Array<String>) {
    val jake = Person()
    jake.name = "Jake Hill"
    jake.age = 24
    jake.college = "Telkom University"
    println(jake.name)
}