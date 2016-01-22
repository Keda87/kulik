package id.co.adiyatmubarak.learnscala.basic

/**
 * Created by adiyatmubarak on 10/18/15.
 */
object FunctionCall {

  /** Function does not return a value. **/
  def printHello() : Unit = {
    println("Hello world from function call !!")
  }

  /** Function returned a value. **/
  def addInt(a:Int, b:Int): Int = {
    var result : Int = 0
    result = a + b

    result
  }

  def main(args: Array[String]) {
    printHello()
    println("Returned Value: " + addInt(10, 10))
  }

}
