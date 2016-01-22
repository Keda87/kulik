package id.co.adiyatmubarak.learnscala.basic

/**
 * Created by adiyatmubarak on 10/28/15.
 */
class ErrorHandling {

  def division(x: Int, y: Int): Int = {
    x / y
  }

}

object Test {
  def main(args: Array[String]) {
    val e = new ErrorHandling()

    try {
      println("Division: " + e.division(1, 0))
    } catch {
      case e: ArithmeticException => {
        println("Tidak boleh dibagi 0.")
      }
    } finally {
      println("Selalu di eksekusi.")
    }
  }
}
