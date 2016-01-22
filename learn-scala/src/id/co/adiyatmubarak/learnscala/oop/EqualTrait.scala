package id.co.adiyatmubarak.learnscala.oop

/**
 * Created by adiyatmubarak on 10/22/15.
 */
// Trait definition, same as abstract class in java.
trait EqualTrait {
  def isEqual(x: Any): Boolean                  // method without implementation.
  def isNotEqual(x: Any): Boolean = !isEqual(x) // method with implementation.
}

// One class could extend several trait with `with` keyword.
class AnotherPoint(val xc: Int, val yc: Int) extends EqualTrait {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int): Unit = {
    x += dx
    y += dy
    println("Point x location: " + x)
    println("Point y location: " + y)
  }

  override def isEqual(x: Any): Boolean = {
    x.isInstanceOf[AnotherPoint] && x.asInstanceOf[AnotherPoint].x == x
  }
}

object TestTrait {
  def main(args: Array[String]) {
    val p1 = new AnotherPoint(1, 1)
    val p2 = new AnotherPoint(2, 2)
    val p3 = new AnotherPoint(3, 3)

    println(p1.isNotEqual(p2))
    println(p1.isNotEqual(p3))
    println(p1.isNotEqual(2))
  }
}
