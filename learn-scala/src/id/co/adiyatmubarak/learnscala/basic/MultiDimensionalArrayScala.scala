package id.co.adiyatmubarak.learnscala.basic

import scala.Array._

/**
 * Created by adiyatmubarak on 10/21/15.
 */
object MultiDimensionalArrayScala {
  def main(args: Array[String]) {
    val arrDim = ofDim[Int](3, 3)

    var counter = 0
    for (i <- 0 until 3; j <- 0 until 3) {
      counter += 1
      arrDim(i)(j) = counter
    }

    for (i <- 0 until 3) {
      for (j <- 0 until 3) {
        print(arrDim(i)(j) + " ")
      }
      println()
    }
  }
}
