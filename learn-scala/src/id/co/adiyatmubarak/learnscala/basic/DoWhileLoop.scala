package id.co.adiyatmubarak.learnscala.basic

/**
 * Created by adiyatmubarak on 10/18/15.
 */
object DoWhileLoop {
  def main(args: Array[String]) {
    var x = 10

    do {
      println("Value x = " + x)
      x += 1
    } while (x <= 20)

  }
}
