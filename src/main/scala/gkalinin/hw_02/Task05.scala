package gkalinin.hw_02

/**
 * Write a procedure countdown(n: Int) that prints the numbers from n to 0.
 */
object Task05 {
  def main(args: Array[String]): Unit = {
    countdown(5)
  }

  def countdown(n: Int): Unit = {
    for (i <- n to 0 by -1) {
      println(i)
    }
  }
}
