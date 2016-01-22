package id.co.adiyatmubarak.learnscala.concurrency

/**
 * Created by adiyatmubarak on 10/28/15.
 */
object ThreadDemo {
  def main(args: Array[String]) {
    val hello = new Runnable {
      override def run(): Unit = {
        println("Hello world thread!")
      }
    }

    hello.run()
  }
}
