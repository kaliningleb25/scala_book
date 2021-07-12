package gkalinin.hw_06

/**
 * Define a Point class with a companion object so that you can construct Point instances as Point(3, 4), without using new.
 */
object Task04 {
  def main(args: Array[String]): Unit = {
    Point(3,4)
  }
}

class Point(x: Int, y: Int) {
  println(x)
  println(y)
}

object Point {
  def apply(x: Int, y: Int): Point = new Point(x, y)
}
