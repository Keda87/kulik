package id.co.adiyatmubarak.learnscala.basic

/**
 * Created by adiyatmubarak on 10/18/15.
 */
object VariableDeclaration {
  def main(args: Array[String]) {

    /** Mutable variable declaration using `var` **/
    var mutableVar : String = "Foo"
    mutableVar = "Bar"
    println(mutableVar)

    /** Immutable variable declaration using `val` **/
    val immutableVar : String = "Foo"
    println(immutableVar)
  }
}
