package id.co.adiyatmubarak.learnscala.basic

/**
 * Created by adiyatmubarak on 10/20/15.
 */
object RecursiveFunction {

  def factorial(n: BigInt): BigInt = {
    if (n <= 1) {
      1
    } else {
      n * factorial(n - 1)
    }
  }

  def fib(n: BigInt): BigInt = {
    if (n <= 1) {
      n
    } else {
      fib(n) + fib(n - 1)
    }
  }

  def main(args: Array[String]) {
    for (i <- 1 to 10) {
      println("Factorial:" + factorial(i))
    }
  }
}
