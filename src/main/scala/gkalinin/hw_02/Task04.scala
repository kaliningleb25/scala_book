package gkalinin.hw_02

/**
 * Write a Scala equivalent for the Java loop
 * for (int i = 10; i >= 0; i--) System.out.println(i);
 */
object Task04 {
  def main(args: Array[String]): Unit = {
    for (i <- 10 to 0 by -1) {
      println(i)
    }
  }
}
