package id.co.adiyatmubarak.learnscala.oop

/**
 * Created by adiyatmubarak on 10/22/15.
 */
trait Caller {
  def callMe(): Unit
}

trait Sender {
  def send(): Unit
}

trait Info {
  def info(): Unit
}

class MulTrait extends Caller with Sender with  Info {
  override def callMe(): Unit = {
    println("Hello world!")
  }

  override def send(): Unit = {
    println("I send you a message...")
  }

  override def info(): Unit = {
    println("You've got some new information!")
  }
}

object MulTrait {
  def main(args: Array[String]) {
    val m = new MulTrait()
    m.callMe()
    m.send()
    m.info()
  }
}
