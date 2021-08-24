object Task04 {
  def main(args: Array[String]): Unit = {
    object Point {
      def apply(x: Int, y: Int) = new Point(x, y)
    }
    class Point(x: Int = 0, y: Int = 0) {}
    val p = Point(1, 1)

  }
}
// without object companion i have an error
// Point.type does not take parameters
//    val p = Point(1, 1)