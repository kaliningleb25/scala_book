package gkalinin.hw_02

/**
 * Come up with one situation where the assignment x = y = 1 is valid in Scala. (Hint: Pick a suitable type for x.)
 */
object Task03 {
  def main(args: Array[String]): Unit = {
    var x = {}
    var y = 0

    x = y = 1

    println(s"x = $x")
    println(s"y = $y")
  }
}
