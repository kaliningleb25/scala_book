package msazonov.hw_06

/***
 * 4. Define a Point class with a companion object so that you can construct Point instances as Point(3, 4), without using new.
 */
object Task04 {
    def main(args: Array[String]): Unit = {
        print(Point(3, 4))
    }
}

class Point(val x: Int, val y: Int) {
    override def toString: String = "(" + x + ", " + y + ")"
}

object Point {
    def apply(x: Int, y: Int) = new Point(x, y)
}