package id.co.adiyatmubarak.learnscala.basic

/**
 * Created by adiyatmubarak on 10/20/15.
 */
object ArrayScala {
  def main(args: Array[String]) {
    // Declaring array.
    //var arr:Array[String] = new Array[String](3)
    val arr = new Array[String](3)
    arr(0) = "adit1"
    arr(1) = "adit2"
    arr(2) = "adit3"

    for(i <- arr) {
      println(i)
    }
    println()
    val anotherArr = Array("adit3", "adit1", "adit2")
    for (i <- anotherArr) {
      println(i)
    }
    println()

    val arrInt = Array(3, 5, 2, 1, 7)
    var total:Int = 0
    var max = arrInt(0)

    for (i <- arrInt) {
      total += i // Sum

      // Find max
      if (i > max) {
        max = i
      }
    }
    println("Total: " + total)
    println("Max: " + max)

    // Iterate array with traditional indexed.
    for (i <- arrInt.indices) {
      val res = "Index: " + i + " Value: " + arrInt(i)
      println(res)
    }
  }
}
