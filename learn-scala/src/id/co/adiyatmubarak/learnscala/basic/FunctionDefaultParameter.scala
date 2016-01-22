package id.co.adiyatmubarak.learnscala.basic

/**
 * Created by adiyatmubarak on 10/20/15.
 */
object FunctionDefaultParameter {

  def addInt(a:Int=10, b:Int=10): Int = {
    a + b
  }

  def main(args: Array[String]) {
    println(addInt())
    println(addInt(100, 1))
  }
}
