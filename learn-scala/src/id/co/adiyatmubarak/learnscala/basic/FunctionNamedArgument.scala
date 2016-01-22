package id.co.adiyatmubarak.learnscala.basic

/**
 * Created by adiyatmubarak on 10/20/15.
 */
object FunctionNamedArgument {

  def printArgument(a:Int, b:Int) = {
    println("Argument a: " + a)
    println("Argument b: " + b)
  }

  def main(args: Array[String]) {
    printArgument(b=2, a=1)
  }
}
