package id.co.adiyatmubarak.learnscala.basic

/**
 * Created by adiyatmubarak on 10/18/15.
 */
object ForLoop {
  def main(args: Array[String]) {

    // For loop with `to`
    for (a <- 1 to 10) {
      println("Value of a: " + a)
    }

    // For loop with until
    for (a <- 1 until 10) {
      println(a)
    }

    /**
     * For loop with multiple range.
     *
     * This loop similar with nested loop in java.
     * for (int a = 0; a <= 5; a++) {
     *     for (int b = 0; b < 5; b++) {
     *         System.out.println(a + " " + b);
     *     }
     * }
     */
    for (a <- 0 to 5; b <- 0 until 5) {
      println(a + " " + b)
    }

    // For loop with collection.
    val listNumber = List(5, 4, 3, 2, 1)
    for (a <- listNumber) {
      println("List: " + a)
    }
  }
}
