package gkalinin.hw_01

import scala.math._

/**
 * In the Scala REPL, compute the square root of 3, and then square that value.
 * By how much does the result differ from 3? (Hint: The res variables are your friend.)
 */
object Task02 {
  def main(args: Array[String]): Unit = {
    var res = 3.0
    res = sqrt(3.0)
    println(s"The square root of 3 is: $res")

    res = pow(res, 2)
    println(s"The square of the res is: $res")
  }
}
