package hello

/**
 * Created by adiyatmubarak on 10/9/16.
 */
class Person(var name: String, var age: Int, var college: String?) {

    var email = ""

    constructor(name: String, age: Int, college: String?, email: String): this(name, age, college) {
        this.email = email
    }

    fun isEligibleToVote(): Boolean {
        return age >= 18
    }
}

fun Person.isTeenager() : Boolean {
    return age in 13..19
}

fun main(args: Array<String>) {
    val jake = Person("Jake Hill", 24, "Stanford")
    println(jake.name + " - " + jake.email + " - " + jake.isEligibleToVote())
    println(jake.isTeenager())

    val thomas = Person("Thomas Matthew", 17, "MIT", "thomas@gmail.com")
    println(thomas.name + " - " + thomas.email + " - " + thomas.isEligibleToVote())
    println(thomas.isTeenager())
}