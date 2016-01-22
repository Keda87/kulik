package id.co.adiyatmubarak.learnscala.basic

/**
 * Created by adiyatmubarak on 10/20/15.
 */
object FunctionNested {

  def manipulateString(str:String): String =  {
    def upper(x:String): String = {
      x.toUpperCase
    }

    upper(str)
  }

  def main(args: Array[String]) {
    println(manipulateString("adiyat mubarak"))
  }
}
