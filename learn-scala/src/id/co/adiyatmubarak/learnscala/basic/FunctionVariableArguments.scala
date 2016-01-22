package id.co.adiyatmubarak.learnscala.basic

/**
 * Created by adiyatmubarak on 10/20/15.
 */
object FunctionVariableArguments {

  def printArgs(args:String*) = {
    var index:Int = 0

    for (i <- args) {
      println("index[" + index + "]: " + i)
      index += 1
    }
  }

  def main(args: Array[String]) {
    printArgs("Java", "Python", "Scala")
  }
}
