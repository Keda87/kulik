package id.co.adiyatmubarak.learnscala.basic

/**
 * Created by adiyatmubarak on 10/20/15.
 */
object FunctionCallByName {

  def time() = {
    println("Getting system in nano seconds..")
    System.nanoTime
  }

  def delayed(t: => Long) = {
    println("In delayed method.")
    println("Param: " + t)
    t
  }

  def main(args: Array[String]) {
    delayed(time())
  }
}
