package id.co.adiyatmubarak.learnscala.oop

/**
 * Created by adiyatmubarak on 10/28/15.
 */
abstract class Shape {
  def getArea(): Int
}

class Circle extends Shape {
  override def getArea(): Int = {
    12
  }
}

object Circle {
  def main(args: Array[String]) {
    val c = new Circle()
    println(c.getArea())
  }
}
