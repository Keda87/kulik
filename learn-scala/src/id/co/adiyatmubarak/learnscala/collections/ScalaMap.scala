package id.co.adiyatmubarak.learnscala.collections

/**
 * Created by adiyatmubarak on 10/21/15.
 */
object ScalaMap {
  def main(args: Array[String]) {
    // Defining map
    var peta : Map[String, String] = Map()
    peta += ("malang" -> "jawa timur")
    peta += ("kediri" -> "jawa timur")

    println("Peta Keys: " + peta.keys)
    println("Peta Values: " + peta.values)
    println("Peta is Empty: " + peta.isEmpty)

    peta.keys.foreach((key) => println(key + " - " +peta(key)))  // display key & value

    peta.keys.foreach {                                          // another display key & value
      x =>
        print("Key: " + x)
        println(" - Value: " + peta(x))
    }

    // Another defining map.
    var person1 = Map(
      "adit" -> 32214,
      "icha" -> 38887,
      "rendra" -> 99383
    )
    person1 += ("hasim" -> 1)

    val person2 = Map(
      "darlin" -> 22322,
      "danang" -> 88393
    )

    // Concatenating map.
    println(person1 ++ person2)   // ++ operator
    println(person1.++(person2))  // ++ method

    // person1.keys.foreach { k => println(k + ":" + person1(k))}

  }
}
