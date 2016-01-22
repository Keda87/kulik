package id.co.adiyatmubarak.learnscala.oop

/**
 * Created by adiyatmubarak on 10/22/15.
 */
class Point(val xc: Int, val yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int): Unit = {
    x += dx
    y += dy
    println("Point x location: " + x)
    println("Point y location: " + y)
  }
}

// Extending `Point` class.
class Location(override val xc: Int, override val yc: Int, val zc: Int) extends Point(xc, yc) {
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int): Unit = {
    x += dx
    y += dy
    z += dz

    println("Point x location: " + x)
    println("Point y location: " + y)
    println("Point z location: " + z)
  }
}

object Test {
  def main(args: Array[String]) {

    // Create instance of `Point` class.
    val p = new Point(10, 20)
    p.move(10, 10)

    // Create instance of `Location` class.
    val l = new Location(10, 10, 10)
    l.move(1, 1, 5)
  }
}
