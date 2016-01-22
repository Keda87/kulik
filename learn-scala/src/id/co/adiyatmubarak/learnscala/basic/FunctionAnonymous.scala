package id.co.adiyatmubarak.learnscala.basic

/**
 * Created by adiyatmubarak on 10/20/15.
 */
object FunctionAnonymous {
  def main(args: Array[String]) {
    val incrementor = (x:Int) => x + 1

    val progList = List("a", "b", "c", "d", "e")

    // val upperProgList = progList.map((x:String) => x.toUpperCase)
    val upperProgList = progList.map { x => x.toUpperCase }

    val excludeAProgList = progList.filterNot((x:String) => x == "a")

    println(upperProgList)
    println(excludeAProgList)
    println(incrementor(9))
  }
}
