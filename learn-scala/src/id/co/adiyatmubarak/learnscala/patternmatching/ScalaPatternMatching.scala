package id.co.adiyatmubarak.learnscala.patternmatching

/**
 * Created by adiyatmubarak on 10/23/15.
 */

class Person(val name: String, val salary: Double) {
}

object Person {

  def salary(p: Person): String = p match {
    case _ if p.salary < 3000000 => "kurang"
    case _ if p.salary >= 3000000 && p.salary <= 5000000 => "cukup"
    case _ if p.salary > 5000000 => "lebih"
  }

  def main(args: Array[String]) {
    val p1 = new Person("budi", 2000000)
    println(salary(p1))

    val p2 = new Person("aziz", 3000000)
    println(salary(p2))

    val p3 = new Person("rina", 10000000)
    println(salary(p3))
  }
}

object ScalaPatternMatching {

  def angka(x: Int): String = {
    x match {
      case 1 => "Satu"
      case 2 => "Dua"
      case 3 => "Tiga"
      case _ => "Belum ditulis :P"
    }
  }

  def main(args: Array[String]) {
    val times = 1

    println(angka(times))
  }
}

// Class case
case class User(var name: String, var age: Int)

object Test {
  def main(args: Array[String]) {
    val us1 = new User("adit", 22)
    val us2 = new User("karim", 25)
    val us3 = new User("dian", 42)

    val users = List(us1, us2, us3)
    for (user <- users) {
      user match {
        case User("adit", 22) => println("Hi adit")
        case User("karim", 25) => println("Halo karim.")
        case User(name, age) => println(name + " -> " +age)
        case _ => println("Teuing maneh saha..")
      }
    }
  }
}
