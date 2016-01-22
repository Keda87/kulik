package id.co.adiyatmubarak.learnscala.basic

/**
 * Created by adiyatmubarak on 10/28/15.
 */
object FunctionCurried {

  def multiply(x: Int)(y: Int): Int = {
    x * y
  }

  def main(args: Array[String]) {
    println(multiply(1)(2))
  }
}
