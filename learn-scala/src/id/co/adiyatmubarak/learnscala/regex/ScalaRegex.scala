package id.co.adiyatmubarak.learnscala.regex

/**
 * Created by adiyatmubarak on 10/29/15.
 */
object ScalaRegex {
  def main(args: Array[String]) {
    val pattern = "Scala".r
    val str     = "Scala is Scalable and cool"

    // Find first matched pattern
    println(pattern findFirstIn str)

    // Find all matched pattern and separate by ,
    println((pattern findAllIn str).mkString(","))

    // Find and replace first matched pattern
    val pattern2 = "(S|s)cala".r
    println(pattern2 replaceFirstIn(str, "Java"))
  }
}
